import org.junit.*
import org.junit.Test
import org.junit.contrib.java.lang.system.SystemOutRule
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class Test {
	@get:Rule
	val systemOutRule = SystemOutRule().enableLog()

	@Test fun testSolution() {
		testRange()
		val range = 1..5
		val results = systemOutRule.log.split("\r\n").filter { !it.isEmpty() }

		for(n in range){
			Assert.assertTrue(results.contains(n.toString()))
		}

	}
}
