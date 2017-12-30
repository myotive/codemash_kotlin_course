
// Add a custom setter to PropertyExample.propertyWithCounter so that the counter property
// is incremented every time propertyWithCounter is assigned to.
class PropertyExample {
    var counter = 0
    var propertyWithCounter: Int? = null
		// Add Custom Setter Heres
        set(value){
            field = value
            counter += 1
        }
}
