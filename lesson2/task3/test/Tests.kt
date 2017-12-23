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

        val languages = arrayOf("Ruby", "Kotlin", "Python", "Java")

        forLoopTest()

        Assert.assertNotNull(outContent.toString())
        val results = outContent.toString().split("\r\n")
        results
            .filter { it != "" }
            .forEach { Assert.assertTrue(languages.contains(it)) }
    }
}
