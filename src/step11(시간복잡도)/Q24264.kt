package `step11(시간복잡도)`

fun main() {
    val br = System.`in`.bufferedReader()

    val input = br.readLine()?.toLong() ?: return

    println(input * input)
    println(2)
}