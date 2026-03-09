package step2

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()

    val n = br.readLine().toInt()

    if (n % 4 == 0 && n % 100 != 0 || n % 400 == 0) sb.append("1")
    else sb.append("0")

    println(sb)
}