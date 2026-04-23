package `step15(약수,배수와소수2)`

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    // 1. 미리 에라스토스테네스의 체 만들기
    val maxNum = 1000000
    val erastos = BooleanArray(maxNum + 1) { true }
    erastos[0] = false
    erastos[1] = false
    // 에라스토스테네스 체 가동
    val limit = kotlin.math.sqrt(maxNum.toDouble()).toInt()
    for (i in 2..limit) {
        if (erastos[i]) {
            for (j in i * i..maxNum step i) {
                erastos[j] = false
            }
        }
    }
    // 2. 테스트 케이스 받기
    repeat(br.readLine()?.toIntOrNull() ?: 0) {
        val input = br.readLine()?.toInt() ?: 0
        var goldbahCount = 0

        for (i in 2..(input / 2)) {
            if (erastos[i] && erastos[input-i]) {
                goldbahCount++
            }
        }
        bw.write("$goldbahCount\n")
    }

    bw.flush()
    bw.close()
    br.close()
}

