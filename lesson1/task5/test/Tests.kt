import org.junit.Assert
import org.junit.Test

class Test {
    @Test fun testSolution() {
        val number = testNumbers()
		Assert.assertTrue(number == "10")

		val result = testString(2018)
		Assert.assertTrue(result == "CodeMash 2018" || result == "CodeMash2018")
    }
}
