package `step4(1차원_배열)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

/** 바구니 뒤집기
 * 1 2 3 4 5
 * 1 2 / 2 1 3 4 5
 * 3 4 / 2 1 4 3 5
 * 1 4 / 3 4 1 2 5
 * 2 2 / --
 */
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt() // 바구니 수
    val m = st.nextToken().toInt() // 바꿀 횟수

    val baskets = IntArray(n)

    repeat(m) {
        st = StringTokenizer(br.readLine())
        var start = st.nextToken().toInt()-1
        var end = st.nextToken().toInt()-1

        // 1. while 문
        while (start < end) {
            // 값 스왑
            val temp = baskets[start]
            baskets[start] = baskets[end]
            baskets[end] = temp

            // 포인터 이동
            start++
            end--
        }
    }

    br.close()
    bw.close()
}