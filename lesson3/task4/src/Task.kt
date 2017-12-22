open class Building(var name: String){
    fun info() = "A building called $name"
}


// To create the house class, extend the building class.
// Add an additional property, rooms,
class House(name: String, var rooms: Int) : Building(name)


fun testHouseMessage(house : House) {
    println("${house.name} has ${house.rooms} rooms")
}

fun testBuildingMessage(house : House){
    println(house.info())
}