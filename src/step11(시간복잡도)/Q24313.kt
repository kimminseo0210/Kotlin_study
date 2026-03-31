package `step11(시간복잡도)`

import java.util.StringTokenizer

data class BigOTestCase(
    val a1: Int,
    val a0: Int,
    val c: Int,
    val n0: Int
)

fun main() {
    val br = System.`in`.bufferedReader()

    val st = StringTokenizer(br.readLine())
    val a1 = st.nextToken().toInt()
    val a0 = st.nextToken().toInt()

    val c = br.readLine().toInt()

    val n0 = br.readLine().toInt()

    val testCase = BigOTestCase(a1, a0, c, n0)

    println(if (chekBigO(testCase)) 1 else 0)
}

private fun chekBigO(testCase: BigOTestCase): Boolean {
    val condition1 = (testCase.a1 * testCase.n0 + testCase.a0) <= (testCase.c * testCase.n0)

    val condition2 = testCase.a1 <= testCase.c

    return condition1 && condition2
}