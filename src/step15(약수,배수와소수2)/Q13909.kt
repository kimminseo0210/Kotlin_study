package `step15(약수,배수와소수2)`

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val input = br.readLine()?.toLongOrNull() ?: 0L

    val result = kotlin.math.sqrt(input.toDouble()).toLong()

    bw.write(result.toString())
    bw.newLine()

    bw.flush()
    bw.close()
    br.close()
}

/* 규칙 5명
1 -> 1,1,1,1,1
2 -> 1,0,1,0,1
3 -> 1,0,0,0,1
4 -> 1,0,0,1,1
5 -> 1,0,0,1,0

마지막에 창문이 열리려면 홀수번 건드려야 함
열 -> 닫 -> 열
 */
