package `step3(반복문)`

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()

    val n = br.readLine().toInt()

    sb.append("long ".repeat(n/4)).append("int ")

    println(sb)
}