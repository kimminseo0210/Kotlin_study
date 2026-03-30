package `step10(기하1)`

import java.util.StringTokenizer
import kotlin.math.min

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val st = StringTokenizer(br.readLine() ?: "")
    val inputX = st.nextToken().toInt()
    val inputY = st.nextToken().toInt()
    val inputW = st.nextToken().toInt()
    val inputH = st.nextToken().toInt()

    bw.write(distance(inputX, inputY, inputW, inputH).toString())
    bw.flush()
}
private fun distance(x:Int, y:Int, w:Int, h:Int) : Int {
    // 방법 1. 가장 권장 (실무 스타일)
    // if문 안의 조건오타 등을 방지할 수 있으며 min을 이용하기 때문에 가장 가독성이 높음
//    var vertical = min(x, w-x)
//    var horizon = min(y, h-y)
//    return min(vertical, horizon)

    // 자바 클래식 if 설계
//    val d1 = x
//    val d2 = w-x
//    val d3 = y
//    val d4 = h-y
//    var minDistance = d1
//    if (d2 < minDistance) minDistance = d2
//    if (d3 < minDistance) minDistance = d3
//    if (d4 < minDistance) minDistance = d4
//    return minDistance

    // 코틀린 익스프레션 방식
    val leftRightDistance = if (x < w-x) x else w-x
    val topBottomDistance = if (y < h-y) y else h-y
    return if (leftRightDistance < topBottomDistance) leftRightDistance else topBottomDistance
}