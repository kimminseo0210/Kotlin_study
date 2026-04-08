package `step13(정렬)`

import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val inputCount = br.readLine().toInt()
//    코틀린이 사전순으로 sort 해버림
//    val xyList = Array(inputCount) {
//        br.readLine()
//    }.apply { sort() }
    val xyList = Array(inputCount) {
        val st = StringTokenizer(br.readLine())

        intArrayOf(
            st.nextToken().toInt(),
            st.nextToken().toInt()
        )

    }
    xyList.sortWith(
        compareBy(
            { it[0] }, { it[1] }
        )
    )

    /** 최적화 코드
     * xyList.sortWith { a, b ->
     *      if (a[0] == b[0]) {
     *          a[1] - b[1]
     *      } else {
     *          a[0] - b[0]
     */

    for (i in xyList) {
        bw.write("${i[0]} ${i[1]}")
        bw.newLine()
    }
    bw.flush()
}