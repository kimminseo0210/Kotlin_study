package `step5(문자열)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val testCaseCount = reader.readLine()?.toInt()?: 0

    repeat(testCaseCount) {
        val inputLine = reader.readLine()?.trim() ?: ""
        val parts = inputLine.split(" ")

        // 실무형 스타일 방어적 코딩 size가 2가 넘을경우
        if (parts.size == 2) {
            val repeatCount = parts[0].toInt()
            val targetString = parts[1]

            val result = targetString.map { it.toString().repeat(repeatCount) }.joinToString("")
            writer.write(result)
            writer.newLine()
        }
    }
    writer.flush()
    writer.close()
}