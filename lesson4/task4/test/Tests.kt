import org.junit.Assert
import org.junit.Test

class Test {
    @Test fun testSolution() {
        val people = listOf<Person>(Person("Michael", 21), Person("Dave", 30))

		val oldest = findTheOldest(people)
		Assert.assertNotNull(oldest)
		Assert.assertTrue(oldest?.name == "Dave")
    }
}
