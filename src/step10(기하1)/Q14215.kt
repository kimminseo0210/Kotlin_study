package `step10(기하1)`

import java.util.StringTokenizer

data class StickCase(val a: Int, val b: Int, val c: Int)

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val st = StringTokenizer(br.readLine() ?: return)

    val sticks = StickCase(
        st.nextToken().toInt(),
        st.nextToken().toInt(),
        st.nextToken().toInt()
    )
    println(maxTriangle(sticks))
}

private fun maxTriangle(sticks: StickCase): Int {
    val s = listOf(sticks.a, sticks.b, sticks.c).sorted()

    if (s[0] + s[1] > s[2]) {
        return s[0] + s[1] + s[2]
    } else {
        return s[0] + s[1] + s[0] + s[1] - 1
    }
}