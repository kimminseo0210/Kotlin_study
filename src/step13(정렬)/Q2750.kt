package `step13(정렬)`

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val arrayCount = br.readLine().toInt()

    var numArray = IntArray(arrayCount) {
        br.readLine()?.toInt() ?: 0
    }
    numArray.sort()
    /** sort를 하면서 apply로 자기 자신을 반환해달라
     * var numArray = IntArray(arrayCount) {
     *     br.readLine()?.toInt() ?: 0
     * }.apply { sort() }
     */

    for (i in numArray) {
        bw.write(i.toString())
        bw.newLine()
    }
    bw.flush()
    bw.close()
}