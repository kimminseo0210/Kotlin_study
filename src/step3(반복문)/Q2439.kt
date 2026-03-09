package `step3(반복문)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val starCount = br.readLine().toInt()

    for (i in 1..starCount) {
        bw.write(" ".repeat(starCount-i) + "*".repeat(i))
        bw.newLine()
    }
    bw.flush()
    bw.close()
}