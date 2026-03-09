package step2

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()

    val n = br.readLine().toInt()

    when {
        n >= 90 -> sb.append("A")
        n >= 80 -> sb.append("B")
        n >= 70 -> sb.append("C")
        n >= 60 -> sb.append("D")
        else -> sb.append("F")
    }
    println(sb)
}