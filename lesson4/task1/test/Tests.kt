import org.junit.Assert
import org.junit.Rule
import org.junit.Test
import org.junit.contrib.java.lang.system.SystemOutRule

class Test {

	@get:Rule
	val systemOutRule = SystemOutRule().enableLog()


	@Test fun testSolution() {

		val strings = listOf("first", "second", "fourteenth")
		listTest()
		Assert.assertTrue(systemOutRule.log.contains(strings.last()))

		systemOutRule.clearLog()

		val numbers = setOf(1, 14, 2)
		setTest()
		Assert.assertTrue(systemOutRule.log.contains(numbers.max().toString()))


		val list = listOf(1, 2, 3, 4, 5)
		val sumTestResult = sumTest(list)

		Assert.assertTrue(list.sum() == sumTestResult)
	}
}
