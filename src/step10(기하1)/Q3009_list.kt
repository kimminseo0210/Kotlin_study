package `step10(기하1)`

import java.util.StringTokenizer


fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    data class Point(val x: Int, val y: Int)

    val points = List(3) {
        val st = StringTokenizer(br.readLine())
        Point(st.nextToken().toInt(),st.nextToken().toInt())
    }

    val x4 = find4thDot(points[0].x, points[1].x, points[2].x)
    val y4 = find4thDot(points[0].y, points[1].y, points[2].y)

    bw.write("$x4 $y4")
    bw.flush()
}

private fun find4thDot(v1:Int, v2:Int, v3:Int) :Int {
    return (
            if (v1 == v2) v3
            else if (v1 == v3) v2
            else v1
            )
}