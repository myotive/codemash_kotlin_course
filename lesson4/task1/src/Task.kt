fun listTest(){
	val strings = listOf("first", "second", "fourteenth")
	println(strings.last())
}

fun setTest(){
	val numbers = setOf(1, 14, 2)
	println(numbers.max())
}

fun sumTest(arr : List<Int>) : Int{
	return arr.sum()
}
