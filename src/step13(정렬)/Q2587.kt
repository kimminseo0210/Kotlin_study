package `step13(정렬)`

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val numArray = IntArray(5) {
        br.readLine()?.toInt() ?: 0
    }.apply { sort() }

    val arraySum = numArray.sum()
    val avgNumArray =arraySum / 5
    val midNum = numArray[2]

    bw.write(avgNumArray.toString())
    bw.newLine()
    bw.write(midNum.toString())

    bw.flush()
    bw.close()
}