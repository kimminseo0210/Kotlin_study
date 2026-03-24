package `step8(수학1)`

import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()

    val st = StringTokenizer(br.readLine() ?: "")
    val amMeter = st.nextToken().toInt()
    val pmMeter = st.nextToken().toInt()
    val totalMeter = st.nextToken().toInt()

    // 1. 마지막 날 낮에 도달하면 미끄러지지 않음
    // 즉, 달팽이가 '오르고 미끄러지는' 과정을 반복하는 실제 거리 = (totalMeter - amMeter)
    val target = totalMeter - amMeter
    // 2. 하루에 실직적으로 올라가는 높이(올라감 - 미끄러짐) = (amMeter - pmMeter)
    val perDay = amMeter - pmMeter
    // 3. (totalMeter - amMeter) 거리를 하루 이동 거리 perDay로 나눔
    var days = target / perDay
    // 4. 만약 나누어 떨어지지 않고 거리가 조금이라도 남았다면 하루가 더 필요함
    if (target % perDay != 0) days++
    // 5. 마지막 날 낮에 amMeter만큼 훌쩍 올라가 정상에 도달하는 '하루'를 더해줌
    days++

    println(days)
}

/**
 * 2 1 5
 * 2-1 1
 * 2-1 2
 * 2-1 3
 * 2-1 4
 * 2 6
 */