package `step13(정렬)`

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val arrayCount = br.readLine().toInt()
    val numList = MutableList<Int>(arrayCount) {
        br.readLine()?.toInt() ?: 0
    }.apply { sort() }

    for (i in numList) {
        bw.write(i.toString())
        bw.newLine()
    }

    bw.flush()
}