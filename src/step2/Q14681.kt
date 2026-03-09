package step2

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() { // 사분면 고르기
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()

    val x = br.readLine().toInt()
    val y = br.readLine().toInt()

    when {
        x>0 && y>0 -> sb.append("1")
        x<0 && y>0 -> sb.append("2")
        x<0 && y<0 -> sb.append("3")
        else -> sb.append("4")
    }
    println(sb)
}