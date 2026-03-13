package `step7(2차원배열)`

import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    var st = StringTokenizer(br.readLine() ?: "")
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    // 2차원 배열을 선언하는 방법
    var matrix = Array(n) { IntArray(m) }
    repeat (n)
}