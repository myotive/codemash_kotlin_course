import org.junit.*
import org.junit.Test
import org.junit.contrib.java.lang.system.SystemOutRule
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class Test {

	@get:Rule
	val systemOutRule = SystemOutRule().enableLog()

    @Test fun testSolution() {

        val languages = arrayOf("Ruby", "Kotlin", "Python", "Java")

        forLoopTest()

		val output = systemOutRule.log
        Assert.assertNotNull(output)
        val results = output.split("\r\n")
        results
            .filter { it != "" }
            .forEach { Assert.assertTrue(languages.contains(it)) }
    }
}
