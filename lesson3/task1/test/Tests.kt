import org.junit.*
import org.junit.Test
import org.junit.contrib.java.lang.system.SystemOutRule
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class Test {

	@get:Rule
	val systemOutRule = SystemOutRule().enableLog()

    @Test fun testSolution() {
        foo()

		val output = systemOutRule.log
        Assert.assertNotNull(output)
        Assert.assertTrue(output.trim() != "")
    }
}
