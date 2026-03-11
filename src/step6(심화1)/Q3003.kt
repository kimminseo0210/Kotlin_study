package `step6(심화1)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    // 킹 1, 퀸 1, 룩 2, 비숍 2, 나이트 2, 폰 8,
    // 1 1 2 2 2 8
    val requiredChess = intArrayOf(1, 1, 2, 2, 2, 8)

    val st = StringTokenizer(reader.readLine() ?: "")
    /*val equalsChess = IntArray(6) { st.nextToken().toInt() }

    val totalChess = IntArray(6) { index ->
        requiredChess[index] - equalsChess[index]
    }*/

    val result = requiredChess.map { required ->
        required - (if (st.hasMoreTokens()) st .nextToken().toInt() else 0)
    }

    writer.write(result.joinToString(" "))
    writer.newLine()
    writer.flush()
    writer.close()
    reader.close()
}