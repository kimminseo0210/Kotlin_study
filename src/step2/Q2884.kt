package step2

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()

    val st = StringTokenizer(br.readLine())

    var h = st.nextToken().toInt()
    var m = st.nextToken().toInt()

    if (m < 45) {
        m += 15
        if (h == 0) h =23 else h -= 1
    } else {
        m -= 45
    }

    println("${h} ${m}")
}