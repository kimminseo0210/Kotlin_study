package `step14(집합과맵)`

import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val inputNum = br.readLine().toInt()

    val staffMap = HashMap<String, String>(inputNum)
    repeat(inputNum) {
        val st = StringTokenizer(br.readLine() ?: "")
        val key = st.nextToken()
        val value = st.nextToken()

        if (value == "enter") {
            staffMap[key] = value
        } else {
            staffMap.remove(key)
        }
    }
    // 해시맵 거꾸로 돌리기
    val result = staffMap.toSortedMap(compareByDescending { it })

    for (name in result.keys) {
        bw.write(name)
        bw.newLine()
    }

    bw.flush()
    bw.close()
    br.close()
}