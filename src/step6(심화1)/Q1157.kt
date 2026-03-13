package `step6(심화1)`

fun main() {
    val reader = System.`in`.bufferedReader()
    val writer = System.out.bufferedWriter()
    val sb = StringBuilder()

    val word = reader.readLine()?.uppercase() ?: ""


    val counts = IntArray(26)

    for (char in word) {
        if (char in 'A'..'Z') {
            counts[char - 'A']++
        }
    }

    val maxCount = counts.maxOrNull() ?: 0

    if (counts.count { it == maxCount } > 1 ) {
        writer.write("?")
    } else {
        val maxIndex = counts.indexOf(maxCount)
        writer.write("${'A' + maxIndex}")
    }

    writer.flush()
    writer.close()
    reader.close()
}