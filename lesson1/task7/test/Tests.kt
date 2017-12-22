import org.junit.Assert
import org.junit.Test

class Test {
    @Test fun testSolution() {
        var person = Person("Test", 1)

        Assert.assertNotNull(person)
    }
}