package `step14(집합과맵)`

import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val st = StringTokenizer(br.readLine() ?: "")
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    // 입력한 문자열
    val strSet = HashSet<String>(n)
    repeat(n) {
        strSet.add(br.readLine() ?: "")
    }

    // 검사
    var checkStr = 0
    repeat(m) {
        val str = br.readLine() ?: ""
        if (strSet.contains(str)) checkStr++
    }
    bw.write("$checkStr")

    bw.flush()
    bw.close()
    br.close()
}