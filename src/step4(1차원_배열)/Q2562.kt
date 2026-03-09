package `step4(1차원_배열)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val numArray = IntArray(9)

    for (i in 0..8) {
        numArray[i] = br.readLine().toInt()
    }
    bw.write("${numArray.max()}\n${numArray.indexOf(numArray.max())+1}")
    bw.flush()
    bw.close()
}