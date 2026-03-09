package step4

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()

    val n = br.readLine().toInt()

    // 코틀린의 독특한 배열선언 방식
    val numArr = IntArray(n)

    val st = StringTokenizer(br.readLine())
    for (i in 0 until n) numArr[i] = st.nextToken().toInt()

    var min = 1000001
    var max = -1000001

    numArr.forEach {
        if (it < min) min = it
        if (it > max) max = it
    }

    println("${min} ${max}")
}