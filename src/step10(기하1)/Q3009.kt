package `step10(기하1)`

import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    var dotsArray = Array(3) { it ->
        val st = StringTokenizer(br.readLine() ?: "")
        intArrayOf(st.nextToken().toInt(), st.nextToken().toInt())
    }

    var x4 =
        if (dotsArray[0][0] == dotsArray[1][0]) {
            dotsArray[2][0]
        } else if (dotsArray[0][0] == dotsArray[2][0]) {
            dotsArray[1][0]
        } else {
            dotsArray[0][0]
        }
    var y4 =
        if (dotsArray[0][1] == dotsArray[1][1]) {
            dotsArray[2][1]
        } else if (dotsArray[0][1] == dotsArray[2][1]) {
            dotsArray[1][1]
        } else {
            dotsArray[0][1]
        }
    bw.write("$x4 $y4")
    bw.flush()
}

