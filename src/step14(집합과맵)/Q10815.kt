package `step14(집합과맵)`

import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    // 상근 카드를 HashMap데 저장 (존재 유무 체크 전용)
    val n = br.readLine().toInt()
    val st1 = StringTokenizer(br.readLine())

    // 실무 팁 : 초기 용량을 지정해주면 메모리 재할당을 막아 성능이 좋아짐
    val sangCards = HashSet<Int>(n)
    repeat(n) {
        sangCards.add(st1.nextToken().toInt())
    }

    // 찾을 카드 확인
    val m = br.readLine().toInt()
    val st2 = StringTokenizer(br.readLine())

    repeat(m) {
        val card = st2.nextToken().toInt()
        // HashSet의 contains는 데이터가 아무리 많아도 단번에 찾음
        if (sangCards.contains(card)) {
            bw.write("1 ")
        } else {
            bw.write("0 ")
        }
    }

    bw.flush()
    bw.close()
    br.close()
}