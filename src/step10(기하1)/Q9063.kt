package `step10(기하1)`

data class LandPoint(val x: Int, val y: Int)

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val caseCount = br.readLine()?.toInt() ?: 0

    var points = List(caseCount) {
        val input = br.readLine()?.split(" ") ?: listOf("0 0")
        LandPoint(input[0].toInt(), input[1].toInt())
    }

    bw.write(calculateArea(points).toString())
    bw.flush()
}

private fun calculateArea(points: List<LandPoint>): Long {
    if (points.isEmpty() || points.size == 1) return 0L

    val maxX = points.maxOf { it.x }
    val minX = points.minOf { it.x }
    val maxY = points.maxOf { it.y }
    val minY = points.minOf { it.y }

    return (maxX - minX).toLong() * (maxY - minY).toLong()
}