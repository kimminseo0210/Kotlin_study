package `step8(수학1)`

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val testCase = br.readLine().toInt()

    var coins = intArrayOf(25, 10, 5, 1)

    repeat(testCase) {
        var change = br.readLine().toInt()
        val sb = StringBuilder()

        for ( coin in coins ) {
            val count = change / coin
            change %= coin

            sb.append("$count ")
        }
        bw.write(sb.toString().trim())
        bw.newLine()
    }
    bw.flush()
    bw.close()
}