package `step3(반복문)`

import java.io.BufferedReader
import java.io.InputStreamReader

// 별 찍기 1
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()

    val starCount = br.readLine().toInt()

    for (i in 1..starCount) {
        var star = "*".repeat(i)
        sb.append(star)
    }
    println(sb)
}