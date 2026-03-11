package `step5(문자열)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val inputReader = BufferedReader(InputStreamReader(System.`in`))
    val outputWriter = BufferedWriter(OutputStreamWriter(System.out))

    val alphabetArr = IntArray(26) {-1}
    val stringLine = inputReader.readLine() ?: ""

    for ((index, char) in stringLine.withIndex()) {
        val alphatbetIndex = char -'a'

        if (alphabetArr[alphatbetIndex] != -1) continue
        alphabetArr[alphatbetIndex] = index
    }

    outputWriter.write(alphabetArr.joinToString(" "))
    outputWriter.flush()
    outputWriter.close()
    inputReader.close()
}