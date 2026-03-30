package `step10(기하1)`

fun main() {
    val br = System.`in`.bufferedReader()

    val input = br.readLine()?.toLong() ?: 0
    val result = input * 4

    println(result)
}
/**
 * 1 = 4
 * 1+2 = 4+4
 * 1+2+3 = 8+4
 * 1+2+3+4 = 12+4
 * 4n 배수 형태
 */