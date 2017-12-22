
// Use the elvis operator to return 0 if the string is null
fun strLenSafe(s: String?): Int = s?.length ?: 0

fun testSafeString() {
    println(strLenSafe("abc"))
    println(strLenSafe(null))
}