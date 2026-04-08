package `step10(기하1)`

import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val sb = StringBuilder()

    while (true) {
        val st = StringTokenizer(br.readLine() ?: "")
        val input1 = st.nextToken().toInt()
        val input2 = st.nextToken().toInt()
        val input3 = st.nextToken().toInt()

        if (input1 == 0 && input2 == 0 && input3 == 0) break

        sb.append(triangleType(input1, input2, input3)).append('\n')
    }
    bw.write(sb.toString())
    bw.flush()
}

private fun triangleType(d1:Int, d2:Int, d3:Int) : String {

    val sides = listOf(d1, d2, d3).sorted()

    if (sides[2] >= sides[0] + sides[1]) return "Invalid"

    return when {
        d1 == d2 && d2 == d3 -> "Equilateral"
        d1 == d2 || d2 == d3 || d1 == d3 -> "Isosceles"
        else -> "Scalene"
    }
}
