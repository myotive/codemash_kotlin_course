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

		val strings = listOf("first", "second", "fourteenth")
		listTest()
		Assert.assertTrue(outContent.toString().contains(strings.last()))

		outContent.reset()

		val numbers = setOf(1, 14, 2)
		setTest()
		Assert.assertTrue(outContent.toString().contains(numbers.max().toString()))


		val list = listOf(1, 2, 3, 4, 5)
		val sumTestResult = sumTest(list)

		Assert.assertTrue(list.sum() == sumTestResult)
	}
}
