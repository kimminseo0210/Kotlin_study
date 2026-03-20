package `step7(2차원배열)`

import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    var matrix = Array (9) { IntArray(9) }

    var maxNum = -1
    var maxRow = 1
    var maxCol = 1

    repeat(9) { i ->
        val st = StringTokenizer(br.readLine() ?: "")
        repeat(9) { j ->
            val current = st.nextToken().toInt()
            matrix[i][j] = current

            if ( current > maxNum ) {
                maxNum = current
                maxRow = i+1
                maxCol = j+1
            }
        }
    }

    val sb = StringBuilder()
    sb.append(maxNum).append('\n').append("$maxRow $maxCol")
    bw.write(sb.toString())
    bw.flush()
    bw.close()
}