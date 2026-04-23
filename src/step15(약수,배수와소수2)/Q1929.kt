package `step15(약수,배수와소수2)`

import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val st = StringTokenizer(br.readLine() ?: "")

    val startNum = st.nextToken().toInt()
    val endNum = st.nextToken().toInt()

    // 에라스토스테네스의 체
    val isPrimeArray = BooleanArray(endNum+1) { true }

    isPrimeArray[0] = false
    isPrimeArray[1] = false

    // 에라스토스테네스의 체 가동
    val limit = kotlin.math.sqrt(endNum.toDouble()).toInt()
    for ( i in 2..limit) {
        if (isPrimeArray[i]) {
            for (j in i*i..endNum step i) {
                isPrimeArray[j] = false
            }
        }
    }

    // startNum부터 endNum까지 소수만 출력
    val sb = StringBuilder()
    for ( i in startNum..endNum) {
        if (isPrimeArray[i]) sb.append(i).append('\n')
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
    br.close()
}