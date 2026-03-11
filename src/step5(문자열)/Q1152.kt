package `step5(문자열)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val charLine = reader.readLine()?.trim() ?: ""

    if (charLine.isEmpty()) {
        writer.write("0")
        writer.flush()
        writer.close()
        return
    }

    val wordsCount = charLine.split(" ")
    writer.write(wordsCount.size.toString())
    writer.flush()
    writer.close()
}