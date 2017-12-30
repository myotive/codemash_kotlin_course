data class Person(val name: String, val age: Int)

fun findTheOldest(people: List<Person>) : Person? {
	// Use the maxBy higher-order function to complete this function to find the older person
	return people.maxBy { it.age }
}
