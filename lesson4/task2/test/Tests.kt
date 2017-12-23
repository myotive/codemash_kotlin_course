import org.junit.Assert
import org.junit.Test

class Test {
    @Test fun testSolution() {
        var  tempMap = mapOf<String, Int>()
		var result = mapExample(tempMap)

		Assert.assertTrue(result.size > 0)
    }
}
