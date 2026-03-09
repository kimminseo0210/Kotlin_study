package `step4(1차원_배열)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val remainder = IntArray(42)
    var count = 0;

    repeat(10) {
        val num = br.readLine().toInt()
        remainder[num%42]++
    }
    for (i in remainder) {
        if (i != 0) count++
    }
    println(count)
}