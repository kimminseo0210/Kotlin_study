package `step8(수학1)`

import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    var sb = StringBuilder()

    var st = StringTokenizer(br.readLine() ?: "")

    val N = st.nextToken()          // 문자열이 들어갈 변수
    val B = st.nextToken().toInt()  // 진법이 들어갈 변수

    var result = 0L
    var multiplier = 1L

    for ( i in N.length - 1 downTo 0) {
        val char = N[i]
        val value = if (char in '0'..'9') {
            char - '0'
        } else {
            char - 'A' + 10
        }
        result += multiplier * value
        multiplier *= B
    }
    println(result)
}