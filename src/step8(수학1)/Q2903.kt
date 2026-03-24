package `step8(수학1)`

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val repeatCount = br.readLine()?.toInt() ?: 0

    var currentDots = 2 // 초기 한 변의 점의 개수
    repeat(repeatCount) {
        currentDots += (currentDots - 1)
    }
    val result = currentDots*currentDots
    bw.write(result.toString())
    bw.flush()
}
/** 중앙이동 알고리즘
 * 0 - 4 (2*2)2
 * 1 - 4,5 (3*3)2 + 1
 * 2 - 4,5,16 (5*5)3 + 2
 * 3 - 4,5,16,81 (9*9) 5 + 4
 * 4 - 4,5,16,81, (17*17) 9 + 8
 * 점의 개수는 직전 사각형의 한 변의 점의 수 (2) 에서 절반(1)을 더한 값 3
 */