package `step4(1차원_배열)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    val baskets = IntArray(n)

    repeat(m) { // 횟수만 있으면 되므로 repreat
        st = StringTokenizer(br.readLine())
        val i = st.nextToken().toInt()
        val j = st.nextToken().toInt()
        val k = st.nextToken().toInt()

        // 덮어씌우니 += 가 아닌 =
        for (index in i..j) baskets[index-1] = k
    }
    // 출력
    for (ball in baskets) bw.write("$ball ")
    bw.flush()
    bw.close()
}