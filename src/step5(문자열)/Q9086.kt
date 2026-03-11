package `step5(문자열)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val testCase = br.readLine().toInt()

    repeat (testCase) {
        val str = br.readLine()
        bw.write("${str[0]}${str[str.length-1]}")
        bw.newLine()
    }
    bw.flush()
    bw.close()
}