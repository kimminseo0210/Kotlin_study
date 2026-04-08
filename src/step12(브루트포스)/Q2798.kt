package `step12(브루트포스)`

import java.util.StringTokenizer

data class BlackJackGame(
    val cardCount: Int,
    val targetSum: Int,
    val cardList: List<Int>
)

fun main() {
    val br = System.`in`.bufferedReader()
    val st1 = StringTokenizer(br.readLine())

    val n = st1.nextToken().toInt()
    val m = st1.nextToken().toInt()

    val st2 = StringTokenizer(br.readLine())
    val cards = List(n) { st2.nextToken().toInt() }

    val game = BlackJackGame(n, m, cards)

    println(BlackJackSum(game))
}

private fun BlackJackSum(game: BlackJackGame): Int {
    var maxResult = 0

    for (i in 0 until game.cardCount-2) {
        for (j in i+1 until game.cardCount - 1) {
            for (k in j+1 until game.cardCount) {
                val currentSum = game.cardList[i] + game.cardList[j] + game.cardList[k]

                if (currentSum <= game.targetSum && currentSum > maxResult) {
                    maxResult = currentSum
                }
            }
        }
    }
    return maxResult
}