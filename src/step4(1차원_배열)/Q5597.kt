package `step4(1차원_배열)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val student = IntArray(31)

    repeat(28) {
        val number = br.readLine().toInt()
        student[number] = 1
    }
    for (i in 1 .. 30) {
        if (student[i] == 0) bw.write("$i\n")
    }
    bw.flush()
    bw.close()
}