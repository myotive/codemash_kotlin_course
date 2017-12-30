// Create a Customer class with a "name" property
class Customer(var name: String = "")

fun foo(){

	// Create Customer object and initialize the Name property
    val customer = Customer()

    customer.name = "Michael"

    println(customer.name)
}
