package `step14(집합과맵)`

import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    val st1 = StringTokenizer(br.readLine() ?: "")

    val cardCountMap = HashMap<Int, Int>(n)
    repeat(n) {
        val card = st1.nextToken().toInt()
        cardCountMap[card] = cardCountMap.getOrDefault(card, 0) + 1
    }

    val m = br.readLine().toInt()
    val st2 = StringTokenizer(br.readLine() ?: "")

    repeat(m) {
        val targetCard = st2.nextToken().toInt()
        val card = cardCountMap.getOrDefault(targetCard,0)
        bw.write("$card ")
    }

    bw.flush()
    bw.close()
    br.close()
}