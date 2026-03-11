package `step5(문자열)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))
    val st = StringTokenizer(reader.readLine() ?: "")

    // 예외 상황 ( 입력 x )
    if (st.countTokens() < 2) return

    val firstInput = (st.nextToken()).reversed().toInt()
    val secondInput = (st.nextToken()).reversed().toInt()

    val result = if (firstInput > secondInput) firstInput else secondInput

    writer.write(result.toString())
    writer.newLine()

    writer.flush()
    writer.close()
    reader.close()
}