package `step12(브루트포스)`

fun main() {
    val br = System.`in`.bufferedReader()

    val sugarKg = br.readLine().toInt()

    val result = minSugarBags(sugarKg)

    println(result)
}

private fun minSugarBags(n: Int): Int {
    var remainingSugar = n
    var bagCount = 0

    while (remainingSugar >= 0) {
        if (remainingSugar % 5 == 0) {
            return bagCount + remainingSugar / 5
        }
        remainingSugar -= 3
        bagCount++
    }

    return -1
}