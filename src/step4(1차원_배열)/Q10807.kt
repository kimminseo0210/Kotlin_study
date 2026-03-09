package `step4(1차원_배열)`

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()
    // 길이
    val input = br.readLine().toInt()
    // 배열 선언
    val numArr = IntArray(input)
    // 배열 내용 추가
    val st = StringTokenizer(br.readLine())
    for (i in 0 until input) numArr[i] = st.nextToken().toInt()
    // 타겟
    val target = br.readLine().toInt()
    // 타겟 찾기
//    var targetCount = 0;
//    numArr.forEach {
//        if (it == target) targetCount++
//    } 76ms
    var targetCount = numArr.count {it == target} // 80ms
    println(targetCount)
}