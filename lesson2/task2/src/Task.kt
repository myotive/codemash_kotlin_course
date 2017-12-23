fun isEven(x: Int) = x % 2 == 0

fun testWhenExpression(number: Int){
    when{
        isEven(number) -> println("Even")
		else -> println("Odd")
    }
}
