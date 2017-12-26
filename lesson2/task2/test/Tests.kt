import org.junit.Assert
import org.junit.Rule
import org.junit.Test
import org.junit.contrib.java.lang.system.SystemOutRule

class Test {

	@get:Rule
	val systemOutRule = SystemOutRule().enableLog()

    @Test fun testSolution() {

        for(i in 1 .. 100){
            testWhenExpression(i)
			val output = systemOutRule.log
            Assert.assertNotNull(output)

            if(isEven(i)) {
                Assert.assertTrue(output.trim() == "Even")
            }
            else{
                Assert.assertTrue(output.trim() == "Odd")
            }

			systemOutRule.clearLog()
        }
    }
}
