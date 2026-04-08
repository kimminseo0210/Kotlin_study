package `step13(정렬)`

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val numCount = br.readLine().toInt()

    var numList = IntArray(10001)

    repeat(numCount) {
        val input = br.readLine().toInt()
        numList[input]++
    }

    for ((index,value) in numList.withIndex()) {
        repeat(value) {
            bw.write(index.toString())
            bw.newLine()
        }
    }
    bw.flush()

}