package class1

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()

    var st = StringTokenizer(br.readLine())
    // 바구니 수 : n  /  교환 횟수 : m
    val n: Int = st.nextToken().toInt()
    val m: Int = st.nextToken().toInt()
    // 바구니(배열)
    val basket = IntArray(n) { it + 1 }

    repeat(m) {
        st = StringTokenizer(br.readLine())
        val first = st.nextToken().toInt() -1
        val second = st.nextToken().toInt() -1

        val temp = basket[first]
        basket[first] = basket[second]
        basket[second] = temp
    }
    println(basket.joinToString(" "))
}