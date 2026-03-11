package `step5(문자열)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val input = reader.readLine() ?: ""

    var totalTime: Int = 0

    // 예외 : 소문자가 입력될경우 대문자로 변환해서 입력받음
    for (char in input.uppercase()) {
        totalTime += when (char) {
            in 'A'..'C' -> 3
            in 'D'..'F' -> 4
            in 'G'..'I' -> 5
            in 'J'..'L' -> 6
            in 'M'..'O' -> 7
            in 'P'..'S' -> 8
            in 'T'..'V' -> 9
            in 'W'..'Z' -> 10
            else -> 0
        }
    }

    writer.write("$totalTime")
    writer.close()
    reader.close()
}