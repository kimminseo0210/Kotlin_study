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

    val baskets = IntArray(n) { it + 1 }

    repeat(m) {
        st = StringTokenizer(br.readLine())
        var start = st.nextToken().toInt()-1
        var end = st.nextToken().toInt()-1

        // 1. while 문 (직관적)
/*        while (start < end) {
            // 값 스왑
            val temp = baskets[start]
            baskets[start] = baskets[end]
            baskets[end] = temp

            // 포인터 이동
            start++
            end--
        }*/
        // 2. for 문 (수학적 접근)
        // 범위의 절반만큼만 반복한다
        val range = ( end - start ) / 2
        for (i in 0..range) {
            val temp = baskets[start+i]
            baskets[start+i] = baskets[end-i]
            baskets[end-i] = temp
        }
    }
    // joinToString(" ")으로 사이에 빈칸 채워넣기
    bw.write(baskets.joinToString(" "))
    bw.newLine()

    bw.flush()
    br.close()
    bw.close()
}