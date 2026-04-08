package `step13(정렬)`

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val inputNum = br.readLine()

    val numList = inputNum.toCharArray().sorted().reversed()

    for ( i in numList) {
        bw.write(i.toString())
    }
    bw.flush()
}
