import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class Test {
	private val outContent = ByteArrayOutputStream()
	private val errContent = ByteArrayOutputStream()

	@Before
	fun setUpStreams() {
		System.setOut(PrintStream(outContent))
		System.setErr(PrintStream(errContent))
	}

	@After
	fun cleanUpStreams() {
		System.setOut(null)
		System.setErr(null)
	}


	@Test fun testSolution() {
		testRange()
		val range = 1..5
		var results = outContent.toString().split("\r\n").filter { !it.isEmpty() }

		for(n in range){
			Assert.assertTrue(results.contains(n.toString()))
		}

	}
}
