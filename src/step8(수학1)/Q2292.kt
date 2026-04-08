package `step8(수학1)`

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val roomNumber = br.readLine()?.toInt() ?: 0
    var moveCount = 1 // 현재 지나친 방의 수
    var rangeMax = 1  // 현재 테두리값

    while (roomNumber > rangeMax) {
        rangeMax += 6*moveCount
        moveCount++
    }
    bw.write(moveCount.toString())
    bw.flush()
}
/** 벌집 알고리즘
 * 1 -> 2~7 -> 8~19 -> 20~37 -> 38~
 *   +1     +6      +12     +18
 *   6의 배수로 증가
 */