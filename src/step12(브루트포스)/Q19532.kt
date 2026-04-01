package `step12(브루트포스)`

import java.util.StringTokenizer

data class Equation(
    val a: Int, val b: Int, val c: Int,
    val d: Int, val e: Int, val f: Int
)

fun main() {
    val br = System.`in`.bufferedReader()
    val st = StringTokenizer(br.readLine())

    val numList = List(6) { st.nextToken().toInt() }
    val input = Equation(
        numList[0], numList[1], numList[2],
        numList[3], numList[4], numList[5]
    )
    println(Equation(input))
}

private fun Equation(num: Equation): String {

    for (x in -999..999) {
        for (y in -999..999) {
            val satisfiesFirst = (num.a * x + num.b * y == num.c)
            val satisfiesSecond = (num.d * x + num.e * y == num.f)

            if (satisfiesFirst && satisfiesSecond) {
                return "$x $y"
            }
        }
    }
    return ""
}