data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

fun isLeapDay(date: MyDate): Boolean {

	// Destructure the date passed in into year, month, and dayOfMonth variables.
	val (year, month, dayOfMonth) = date

	// 29 February of a leap year
	return year % 4 == 0 && month == 2 && dayOfMonth == 29
}
