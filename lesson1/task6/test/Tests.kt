import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class Test {
    private val outContent = ByteArrayOutputStream()
    private val errContent = ByteArrayOutputStream()

	fun isWindows(): Boolean = OS.indexOf("win") >= 0
	private val OS = System.getProperty("os.name").toLowerCase()
	private val delimiter = if(isWindows()) "\r\n" else "\n"

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

        testSafeString()
        Assert.assertNotNull(outContent.toString())

        val testResults = arrayOf("3", "0")
        val results = outContent.toString().split(delimiter)
        results.filter { it != "" }
                .forEach { Assert.assertTrue(testResults.contains(it)) }
    }
}
