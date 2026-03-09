package step3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()

    val n = br.readLine().toInt()

    repeat(9) {
        sb.append("$n * ${it+1} = ${n*(it+1)}").append("\n")
    }
    println(sb)
}