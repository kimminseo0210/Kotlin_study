package `step9(약수,배수와_소수1)`

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val sb = StringBuilder()

    while (true) {
        val inputNum = br.readLine().trim().toInt()
        if (inputNum == -1) break

        // 약수를 구해서 배열에 저장
        var divisors = mutableListOf<Int>()
        var i = 1

        while (i*i <= inputNum) {
            if (inputNum % i == 0) {
                divisors.add(i)

                // Core 1. i가 1일 때는 짝(자기자신)을 넣지 않음
                if (i != inputNum / i && i != 1) {
                    divisors.add(inputNum / i)
                }
            }
            i++
        }
        // Core 2. 오름차순으로 정리
        divisors.sort()

        val divisorSum = divisors.sum()

        // Core 3. 출력 형식 완벽하게 맞추기
        if (divisorSum == inputNum) {
            sb.append(inputNum).append(" = ").append(divisors.joinToString(" + ")).append('\n')
        } else {
            sb.append(inputNum).append(" is NOT perfect.\n")
        }
    }
    bw.write(sb.toString())
    bw.newLine()
    bw.flush()
}