import org.junit.Assert
import org.junit.Test

class Test {
    @Test fun testSolution() {
		val nonleapDate = MyDate(2017, 12, 23)
		val leapDate = MyDate(2020, 2, 29)
		Assert.assertTrue(isLeapDay(leapDate))
		Assert.assertFalse(isLeapDay(nonleapDate))
    }
}
