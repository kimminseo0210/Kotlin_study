package `step14(집합과맵)`

import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val st = StringTokenizer(br.readLine() ?: "")

    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    val notSee = HashSet<String>(n)
    val resultList = mutableListOf<String>()

    repeat(n) {
        val input = br.readLine() ?: ""
        notSee.add(input)
    }

    repeat(m) {
        val input = br.readLine() ?: ""

        if (notSee.contains(input)) {
            resultList.add(input)
        }
    }

    resultList.sort()

    bw.write(resultList.size.toString())
    bw.newLine()
    bw.write(resultList.joinToString("\n"))

    bw.flush()
    bw.close()
    br.close()
}