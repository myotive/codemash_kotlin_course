data class Person(val name: String, val age: Int)

fun findTheOldest(people: List<Person>) : Person? {
	return people.maxBy { it.age }
}
