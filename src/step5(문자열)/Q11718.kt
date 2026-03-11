package `step5(문자열)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val inputLine = reader.readLine()
        if (inputLine == null || inputLine.isEmpty()) break

        writer.write(inputLine)
        writer.newLine()
    }
    writer.flush()
    writer.close()
    reader.close()
}