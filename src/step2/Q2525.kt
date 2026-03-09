package step2

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {    // 오븐 시계
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()

    var st = StringTokenizer(br.readLine())

    var h = st.nextToken().toInt()
    var m = st.nextToken().toInt()
    val c = br.readLine().toInt()

    var totalMinute = h * 60 + m + c

    h = (totalMinute / 60) % 24
    m = totalMinute % 60

    println("$h $m")
}