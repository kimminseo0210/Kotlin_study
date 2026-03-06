package class1

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

// 두 수 비교하기
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())

    var a = st.nextToken().toInt()
    var b = st.nextToken().toInt()

    when {
        a > b -> println(">")
        a < b -> println("<")
        else -> println("==")
    }
}