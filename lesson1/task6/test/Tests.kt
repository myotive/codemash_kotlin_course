import org.junit.Assert
import org.junit.Rule
import org.junit.Test
import org.junit.contrib.java.lang.system.SystemOutRule


class Test {

	@get:Rule
	val systemOutRule = SystemOutRule().enableLog()


    @Test fun testSolution() {

        testSafeString()
		val output = systemOutRule.log
        Assert.assertNotNull(output)

        val testResults = arrayOf("3", "0")
        val results = output.split("\r\n")
        results.filter { it != "" }
                .forEach { Assert.assertTrue(testResults.contains(it)) }
    }
}
