package class1

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()
    val st = StringTokenizer(br.readLine())

    var result = 0;

    while (st.hasMoreTokens()) {
        var token = st.nextToken().toInt()
        result += token*token
    }
    println(result%10)

}