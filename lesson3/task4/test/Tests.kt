import org.junit.Assert
import org.junit.Rule
import org.junit.Test
import org.junit.contrib.java.lang.system.SystemOutRule

class Test {

	@get:Rule
	val systemOutRule = SystemOutRule().enableLog()


    @Test fun testSolution() {
        val houseText = "My House"
        val houseRooms = 3
        val testHouseMessageString = "$houseText has $houseRooms rooms"
        val testBuildingMessageString = "A building called $houseText"

        val houseTest = House(houseText, houseRooms)

        testHouseMessage(houseTest)
        Assert.assertNotNull(systemOutRule.log)
        Assert.assertTrue(systemOutRule.log.trim() == testHouseMessageString)

		systemOutRule.clearLog()

        testBuildingMessage(houseTest)
        Assert.assertNotNull(systemOutRule.log)
        Assert.assertTrue(systemOutRule.log.trim() == testBuildingMessageString)
    }
}
