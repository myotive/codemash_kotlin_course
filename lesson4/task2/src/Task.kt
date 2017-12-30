
// Practice creating a map (in this case with a String key and an Integer value)
// Combine your map with the map being passed in
fun mapExample(input : Map<String, Int>) : Map<String, Int>{
	val map = mapOf("Ohio" to 1, "California" to 2)

	val mutableMap = mutableMapOf<String, Int>()
	mutableMap.putAll(input)
	mutableMap.putAll(map)

	return mutableMap
}
