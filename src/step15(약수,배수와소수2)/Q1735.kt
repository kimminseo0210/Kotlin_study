package `step15(약수,배수와소수2)`

import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val input1 = br.readLine() ?: ""
    val input2 = br.readLine() ?: ""

    val st1 = StringTokenizer(input1)
    val a = st1.nextToken().toLong()
    val b = st1.nextToken().toLong()

    val st2 = StringTokenizer(input2)
    val c = st2.nextToken().toLong()
    val d = st2.nextToken().toLong()

    // 통분 공식 (a*d + c*b) / (a*d)
    val child = (a * d + c * b)
    val parent = b * d

    val common = GCD1735(child,parent)

    bw.write("${child / common} ${parent / common}")
    bw.flush()
    bw.close()
    br.close()
}

private fun GCD1735(a: Long, b: Long): Long {
    return if (b == 0L) a else GCD1735(b, a % b)
}