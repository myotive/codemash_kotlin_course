fun eval(expr: Expr): Int =
        when (expr) {
            is Num -> expr.value
            is Sum -> expr.left.value + expr.right.value
            else -> throw IllegalArgumentException("Unknown expression")
        }

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Num, val right: Num) : Expr
