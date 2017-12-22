// Create a Customer class with a "name" property
class Customer(var name: String = "")

fun foo(){

    val customer = Customer()

    customer.name = "Michael"

    println(customer.name)
}