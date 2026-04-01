package `step12(브루트포스)`

import java.util.StringTokenizer
import kotlin.math.min


fun main() {
    val br = System.`in`.bufferedReader()
    val st = StringTokenizer(br.readLine())

    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    val chess = Array(n) { br.readLine() }

    var minRepaint = 64

    for (row in 0..n - 8) {
        for (col in 0..m - 8) {
            val currentRepaint = findRepaintPlace(chess, row, col)
            minRepaint = min(minRepaint, currentRepaint)
        }
    }
    println(minRepaint)
}
/**
 * 특정 시작점(startRow, startCol)에서 8x8 크기의 체스판을 검사하여
 * 다시 칠해야 하는 칸 수의 최솟값을 반환하는 실무형 탐색 함수입니다.
 */
private fun findRepaintPlace(board: Array<String>, startRow: Int, startCol: Int): Int {
    var repaintCount = 0

    // 8x8 돋보기 내부를 순회합니다.
    for (r in 0 until 8) {
        for (c in 0 until 8) {
            val currentColor = board[startRow + r][startCol + c]

            // 기준 패턴: 맨 왼쪽 위가 'W'인 체스판으로 가정하고 검사합니다.
            // (r + c)가 짝수인 칸은 'W'여야 하고, 홀수인 칸은 'B'여야 합니다.
            if ((r + c) % 2 == 0) {
                if (currentColor != 'W') repaintCount++
            } else {
                if (currentColor != 'B') repaintCount++
            }
        }
    }

    // 'W'로 시작하는 패턴으로 칠할 때의 횟수(repaintCount)와,
    // 'B'로 시작하는 패턴으로 칠할 때의 횟수(64 - repaintCount) 중 더 작은 값을 리턴합니다.
    return min(repaintCount, 64 - repaintCount)
}
