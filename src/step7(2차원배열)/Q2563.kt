package `step7(2차원배열)`

import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    var sb = StringBuilder()

    val testCase = br.readLine()?.toInt() ?: 0

    var paperMatrix = Array(100) { IntArray(100) { 0 } }

    repeat (testCase) {
        var st = StringTokenizer(br.readLine() ?: "")
        val x = st.nextToken().toInt()
        val y = st.nextToken().toInt()
        for (i in x until x+10) {
            for (j in y until y+10) paperMatrix[i][j] = 1
        }
    }
    var paperCount = paperMatrix.sumOf { row -> row.count { it == 1 } }
    println(paperCount)
}