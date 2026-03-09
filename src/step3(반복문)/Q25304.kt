package `step3(반복문)`

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val x = br.readLine().toInt()
    val n = br.readLine().toInt()

    var totalCost = 0;

    repeat(n) {
        val st = StringTokenizer(br.readLine())
        val cost = st.nextToken().toInt()
        val num = st.nextToken().toInt()

        totalCost += cost * num
    }
    println(if (x == totalCost) "Yes" else "No")
}