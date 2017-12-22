import org.junit.Assert
import org.junit.Test

class Test {
    @Test fun testSolution() {
        val propertyExample = PropertyExample()
        propertyExample.counter = 0

        Assert.assertTrue(propertyExample.counter == 0)

        propertyExample.propertyWithCounter = 1
        Assert.assertTrue(propertyExample.propertyWithCounter == 1)
        Assert.assertTrue(propertyExample.counter == 1)

        propertyExample.propertyWithCounter = 2
        Assert.assertTrue(propertyExample.propertyWithCounter == 2)
        Assert.assertTrue(propertyExample.counter == 2)

    }
}