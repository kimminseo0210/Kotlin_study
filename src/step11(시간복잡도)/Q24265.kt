package `step11(시간복잡도)`

fun main() {
    val br = System.`in`.bufferedReader()

    val input = br.readLine()?.toLong() ?: return

    println((input * (input - 1)) / 2)
    println(2)
}