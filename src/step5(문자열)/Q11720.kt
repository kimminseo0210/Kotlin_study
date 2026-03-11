package `step5(문자열)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val numCount = br.readLine().toInt()
    val inputString: String = br.readLine() ?: ""

    var sum = 0;
    // 1. numCount 필요 없음 -> BEST
//    for (s in inputString) {
//        sum += s.digitToInt()
//    }
    // 2. repeat 함수 사용 -> GOOD
//    repeat(numCount) {
//        sum += inputString[it].digitToInt()
//    }
    // 3. 배열로 저장 후 한 번에 더하고 출력 -> BAD 상황에 따라 좋을 수 있지만 현재 같은 단순 계산에서는 메모리 낭비
//    val numArr = IntArray(numCount)
//    repeat(numCount) {
//        numArr[it] = inputString[it].digitToInt()
//    }
//    bw.write(numArr.sum().toString())
    // 4. 코틀린 실무 고급형
    val totalSum = inputString.sumOf { it.digitToInt() }
    bw.write(totalSum.toString())
    bw.newLine()
    bw.flush()
    bw.close()
}