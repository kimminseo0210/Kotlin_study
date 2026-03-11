package `step5(문자열)`

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val input: String = br.readLine()
    val index: Int = br.readLine().toInt()

    println(input[index-1])
}