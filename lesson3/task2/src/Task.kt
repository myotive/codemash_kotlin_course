
// Make the Customer class a "data" class
data class Customer(var name: String = "")

fun isCustomerEqual() : Boolean{
    val customer1 = Customer("Michael")
    val customer2 = customer1.copy()

    return customer1 == customer2
}