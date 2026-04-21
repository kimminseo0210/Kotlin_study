package `step15(약수,배수와소수2)`

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val repeatCount = br.readLine().toInt()
    val treePosition = LongArray(repeatCount) { br.readLine().toLong() }

    // 0L이 아닌 초기값을 설정해주어 오류 방지 -> GCD(0,-) 일 될뻔함
    var currentGCD = treePosition[1] - treePosition[0]

    for (i in 1 until treePosition.size - 1) {
        val nextInterval = treePosition[i+1] - treePosition[i]
        currentGCD = GCD2485(currentGCD, nextInterval)
    }
    // 나무 수를 구하는 공식 = {(lastTree) - (firstTree) / GCD} + 1
    val totalTreeAmount = (treePosition.last() - treePosition.first()) / currentGCD + 1

    // 필요한 나무
    bw.write("${totalTreeAmount - repeatCount}")

    bw.flush()
    bw.close()
    br.close()
}

private fun GCD2485(a: Long, b: Long): Long {
    return if (b == 0L) a else GCD2485(b, a % b)
}