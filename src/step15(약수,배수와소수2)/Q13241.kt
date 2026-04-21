package `step15(약수,배수와소수2)`

import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val st = StringTokenizer(br.readLine() ?: "")
    val a = st.nextToken().toLong()
    val b = st.nextToken().toLong()

    bw.write("${LCM(a,b)}")

    bw.flush()
    bw.close()
    br.close()
}
private fun LCM(a: Long, b: Long) : Long {
    return (a * b) / GCD(a,b)
}
private fun GCD(a: Long, b: Long) : Long {
    return if (b == 0L) a else GCD(b, a % b)
}