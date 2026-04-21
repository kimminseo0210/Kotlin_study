package `step15(약수,배수와소수2)`

import kotlin.math.sqrt

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    // 입력 로직
    val repeatCount = br.readLine()?.toInt() ?: 0
    val input = List(repeatCount) { br.readLine()?.toLong() ?: 0L }

    // 소수 판별 로직
    val result = input.map { startNum  ->
        var currentNum = startNum
        while (!isPrime4134(currentNum)) {
            currentNum++
        }
        currentNum
    }

    bw.write(
        result.
        joinToString(separator = "\n", postfix = "\n")
    )
    bw.flush()
    bw.close()
    br.close()
}

private fun isPrime4134(num: Long): Boolean {
    if (num < 2 ) return false
    if (num == 2L ) return true
    if (num % 2 == 0L ) return false

    val limit = kotlin.math.sqrt(num.toDouble()).toLong()
    for ( i in 3..limit step 2) {
        if (num % i == 0L) return false
    }
    return true
}