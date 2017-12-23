
// Practice creating a map (in this case with a String key and an Integer value)
// Combine your map with the map being passed in
fun mapExample(input : Map<String, Int>) : Map<String, Int>{
	var map = mapOf("Ohio" to 1, "California" to 2)

	var muteableMap = mutableMapOf<String, Int>()
	muteableMap.putAll(input)
	muteableMap.putAll(map)

	return muteableMap
}
