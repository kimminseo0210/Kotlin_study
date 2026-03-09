package `step3(반복문)`

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var sb = StringBuilder()

    while(true) {
        val line = br.readLine() ?: break
        val st = StringTokenizer(line)
        if (!st.hasMoreTokens()) break

        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()

        sb.append(a+b).append('\n')
    }

    println(sb)
}