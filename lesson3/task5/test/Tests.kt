import org.junit.Assert
import org.junit.Test

class Test {
    @Test fun testSolution() {
        val num = Num(1)
        val sum = Sum(Num(2), Num(3))

        Assert.assertTrue(eval(num) == 1)
        Assert.assertTrue(eval(sum) == 5)
    }
}