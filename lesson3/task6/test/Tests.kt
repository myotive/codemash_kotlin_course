import org.junit.Assert
import org.junit.Test

class Test {
    @Test fun testSolution() {
        val testString = "This is a test of the emergency broadcast system"
        Assert.assertTrue(testString.wordCount() == 9)

        val testString2 = "I, am not, grammatically correct."
        Assert.assertTrue(testString2.wordCount() == 5)
    }
}