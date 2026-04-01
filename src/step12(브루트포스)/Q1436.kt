package `step12(브루트포스)`

fun main() {
    val br = System.`in`.bufferedReader()

    val n = br.readLine().toInt()

    val result = countMovieName(n)

    println(result)
}

private fun countMovieName(n: Int): Int {
    val targetMovieCount = n
    var currentMovieCount = 0
    var finalMovieName = 0

    var i = 0
    while (currentMovieCount < targetMovieCount) {
        if (i.toString().contains("666")) {
            currentMovieCount++
            finalMovieName = i
        }
        i++
    }
    return finalMovieName
}