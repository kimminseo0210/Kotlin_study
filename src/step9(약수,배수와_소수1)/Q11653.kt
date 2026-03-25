package `step9(약수,배수와_소수1)`

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val inputNum = br.readLine().trim().toInt()

    if (inputNum == 1) {
        return
    } else {
        bw.write(primeFactorization(inputNum))
        bw.flush()
        bw.close()
    }
}

private fun primeFactorization(num: Int): String {
    val sb = StringBuilder()

    var i = 2
    var n = num

    while (n > 1) {
        if (n % i == 0) {
            sb.append(i).append('\n')
            n /= i
        }
        else i++
    }

    return sb.toString()
}
