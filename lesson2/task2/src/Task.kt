fun isOdd(x: Int)  = x % 2 != 0
fun isEven(x: Int) = x % 2 == 0

fun testWhenExpression(number: Int){
    when{
        isOdd(number) -> println("Odd")
        isEven(number) -> println("Even")
    }
}