package step3

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var sb = StringBuilder()

    while(true) {
        val st = StringTokenizer(br.readLine())
        val a: Int = st.nextToken().toInt()
        val b: Int = st.nextToken().toInt()

        if (a == 0 && b ==0) break

        sb.append(a+b).append('\n')
    }

    println(sb)
}