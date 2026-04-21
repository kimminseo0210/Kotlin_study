package `step15(약수,배수와소수2)`

import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val repeatCount = br.readLine()?.toInt() ?: 0

    val sb = StringBuilder()

    repeat(repeatCount) {
        val st = StringTokenizer(br.readLine())

        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()

        bw.write("${LCM(a, b)}\n")
    }

    bw.flush()
    bw.close()
    br.close()
}

// 최대공약수 (Greatest Common Divisor)
private fun GCD(a: Int, b: Int): Int {
    return if (b == 0) a else GCD(b, a % b)
}

// 최소공배수 (Least Common Multiple)
private fun LCM(a: Int, b: Int): Int {
    return a * b / GCD(a, b)
}