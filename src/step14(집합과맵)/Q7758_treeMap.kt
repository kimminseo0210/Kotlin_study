package `step14(집합과맵)`

import java.util.StringTokenizer
import java.util.TreeMap

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val inputNum = br.readLine().toInt()

    val staffMap = TreeMap<String, String>(compareByDescending { it })
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
    for (name in staffMap.keys) {
        bw.write(name)
        bw.newLine()
    }

    bw.flush()
    bw.close()
    br.close()
}