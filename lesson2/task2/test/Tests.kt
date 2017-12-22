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

        for(i in 1 .. 100){
            testWhenExpression(i)
            Assert.assertNotNull(outContent.toString())

            if(isEven(i)) {
                Assert.assertTrue(outContent.toString().trim() == "Even")
            }
            else{
                Assert.assertTrue(outContent.toString().trim() == "Odd")
            }

            outContent.reset()
        }
    }
}