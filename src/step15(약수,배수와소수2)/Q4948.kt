package `step15(약수,배수와소수2)`

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    while (true) {

        val input = br.readLine()?.toInt() ?: 0
        if (input == 0) break

        // 에라스토스테네스의 체
        val limitNum = input * 2
        val isPrime = BooleanArray(limitNum + 1) { true }
        isPrime[0] = false
        isPrime[1] = false

        // 에라스토스테네스의 체 가동
        val limit = kotlin.math.sqrt(limitNum.toDouble()).toInt()
        for (i in 2..limit) {
            if (isPrime[i]) {
                for (j in i * i..limitNum step i) {
                    isPrime[j] = false
                }
            }
        }

        var primeCount = 0
        for (i in (input+1)..limitNum) {
            if (isPrime[i]) primeCount++
        }

        bw.write(primeCount.toString())
        bw.newLine()

    }

    bw.flush()
    bw.close()
    br.close()
}