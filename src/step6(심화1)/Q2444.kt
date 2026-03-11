package `step6(심화1)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val n = reader.readLine()?.toInt() ?: 0
    val sb = StringBuilder()

    for (i in 1 until (2*n)) {
        val spaceCount = Math.abs(n-i)
        val starCount = (2*n - 1) - (2 * spaceCount)
        sb.append(" ".repeat(spaceCount))
            .append("*".repeat(starCount))
            .append('\n')
    }
    writer.write(sb.toString())
    writer.flush()
    writer.close()
    reader.close()
}
//    *     4 1 4 - 9
//   ***    3 3 3 - 9
//  *****   2 5 2 - 9
// *******  1 7 1 - 9
//********* 0 9 0 - 9
// *******  1 7 1 - 9
//  *****   2 5 2 - 9
//   ***    3 3 3 - 9
//    *     4 1 4 - 9