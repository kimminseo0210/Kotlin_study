package `step9(약수,배수와_소수1)`

import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val numCount = br.readLine()?.toInt() ?: 0
    val st = StringTokenizer(br.readLine()?.trim() ?: "")

    var numArray = IntArray(numCount) { st.nextToken().toInt() }
    var primeNumberCount = 0

    for (i in numArray) {
        if (isPrime(i)) primeNumberCount++
    }
    bw.write("$primeNumberCount")
    bw.flush()
    bw.close()
}
private fun isPrime(num: Int) : Boolean {
    if (num < 2) return false
    var i = 2
    while (i * i <= num) {
        if (num % i == 0) return false
        i++
    }
    return true
}