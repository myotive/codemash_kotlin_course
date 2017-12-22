import org.junit.Assert
import org.junit.Test

class Test {
    @Test fun testSolution() {
        Assert.assertTrue(sum(0, 2) == 2)
        Assert.assertTrue(sum(1, 2) == 3)
        Assert.assertTrue(sum(2, 2) == 4)
    }
}