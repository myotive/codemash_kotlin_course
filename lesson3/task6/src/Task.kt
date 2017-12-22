/**
 * This extension takes a list of strings and filters out any empty strings.
 */
fun List<String>.removeEmpty() = this.filter { !it.isEmpty() }

// Create a "wordCount" Extension for the String class. The method name is case sensitive.
// For now, let's use split(" ", ".", ",") to determine the words in a string.
// Also, use the "removeEmpty" extension to remove any blank elements.
fun String.wordCount() : Int{
    return this.split(" ", ".", ",").removeEmpty().count()
}