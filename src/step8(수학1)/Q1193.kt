package `step8(수학1)`

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val x = br.readLine()?.toInt() ?: 0

    var crossCount = 1  // 해당 대각선에 있는 분수의 수
    var rangeMax = 1    // 해당 대각선의 마지막 번호


    while (x > rangeMax) {
        crossCount++
        rangeMax += crossCount
    }

    val diff = rangeMax - x
    val sb = StringBuilder()
    if (crossCount % 2 == 0) { // 짝수이면 아래로 읽기
        sb.append(crossCount - diff).append("/").append(1 + diff)
    } else { // 홀수이면 위로 읽기
        sb.append(1 + diff).append("/").append(crossCount - diff)
    }
    bw.write(sb.toString())
    bw.flush()
}
/**
 * 1/1 1/2 1/3 1/4 1/5
 * 2/1 2/2 2/3 2/4
 * 3/1 3/2 3/3
 * 4/1 4/2
 * 5/1
 */