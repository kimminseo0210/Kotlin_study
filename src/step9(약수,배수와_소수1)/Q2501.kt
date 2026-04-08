package `step9(약수,배수와_소수1)`

import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val st = StringTokenizer(br.readLine()?.trim() ?: "")

    val N = st.nextToken().toInt()
    val K = st.nextToken().toInt()

    var divisors = mutableListOf<Int>()

    var i = 1
    while ( i*i <= N) {
        if (N % i == 0) {
            divisors.add(i)

            if (i != N/i) {
                divisors.add(N/i)
            }
        }
        i++
    }
    val sb = StringBuilder()
    divisors.sort()

    if (divisors.size < K) {
        sb.append('0')
    } else {
        sb.append(divisors[K-1])
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
    br.close()
}