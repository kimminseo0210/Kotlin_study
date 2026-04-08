package `step8(수학1)`

import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    var st = StringTokenizer(br.readLine() ?: "")
    var N = st.nextToken().toLong()
    val B = st.nextToken().toInt()

    val sb = StringBuilder()

    while (N > 0) {
        var remainder = (N % B).toInt()
        val char = if (remainder < 10) {
            (remainder + '0'.code).toChar()
        } else {
            (remainder + 'A'.code - 10).toChar()
        }
        sb.append(char)
        N /= B
    }
    println(sb.reverse().toString())
}