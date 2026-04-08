package `step13(정렬)`

import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val inputCount = br.readLine().toInt()

    // 람다식으로 입력받는 배열
    val xyList = Array(inputCount) {
        val st = StringTokenizer(br.readLine())
        intArrayOf(
            st.nextToken().toInt(),
            st.nextToken().toInt()
        )
    }

    xyList.sortWith { a,b ->
        if (a[1] == b[1]) {
            a[0] - b[0]
        } else {
            a[1] - b[1]
        }
    }

    for ( i in xyList) {
        bw.write("${i[0]} ${i[1]}")
        bw.newLine()
    }
    bw.flush()
    bw.close()
}