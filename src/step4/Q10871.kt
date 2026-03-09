package step4

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine())
    val sb = StringBuilder()

    val n = st.nextToken().toInt()
    val x = st.nextToken().toInt()

    st = StringTokenizer(br.readLine())
    for (i in 1..n) {
        val num = st.nextToken().toInt()
        if (num < x) sb.append(num).append(" ")
    }
    println(sb)
}