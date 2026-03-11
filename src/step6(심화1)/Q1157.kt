package `step6(심화1)`

fun main() {
    val reader = System.`in`.bufferedReader()
    val writer = System.out.bufferedWriter()

    val wordsString = reader.readLine() ?: ""

    val wordsArray = IntArray(26)

    for (word in wordsString) {
        wordsArray[word.uppercaseChar() - 'A']++
    }
}