fun main(){
    // Variables can be declared as mutable (var == "variable")
    var myString : String = ""
    myString = "Foo"

    // But they can also be declared as immutable
	// val == "value" or read-only
    val immutableString : String = "Bar"

	// immutableString = "Baz"  <-- This would cause a compiler error

    // The type of a variable can be inferred when it is initialized
	// inferredType can be anything here... an int, a string, etc.
    val inferredType = 2

    // Type required when no initializer is provided, but the assignment can be deferred
	// Let's make the "c" variable an "Int"
    val c : Int

	c = 3
    // c = 4 <-- This would cause a compiler error because the variable was previously assigned
}
