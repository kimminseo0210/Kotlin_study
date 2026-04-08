package `step9(약수,배수와_소수1)`

import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val sb = StringBuilder()

    while (true) {
        val st = StringTokenizer(br.readLine()?.trim() ?: "")
        val firstNum = st.nextToken().toInt()
        val secondNum = st.nextToken().toInt()

        if (firstNum == 0 && secondNum == 0) break

        if (firstNum % secondNum == 0) {
            sb.append("multiple").append('\n')
        } else if (secondNum % firstNum == 0) {
            sb.append("factor").append('\n')
        } else {
            sb.append("neither").append('\n')
        }
    }
    bw.write(sb.toString())
    bw.flush()
}