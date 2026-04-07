package `step13(정렬)`

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val inputCount = br.readLine().toInt()

    val wordList = List(inputCount) { br.readLine() }
        .distinct()
        .sortedWith { a,b ->
            if (a.length == b.length) {
                a.compareTo(b)
            } else {
                a.length - b.length
            }
        }

    for ( word in wordList) {
        bw.write(word)
        bw.newLine()
    }

    bw.close()
}