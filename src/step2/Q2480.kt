package step2

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val st = StringTokenizer(br.readLine())
    val a = st.nextToken().toInt()
    val b = st.nextToken().toInt()
    val c = st.nextToken().toInt()

    when {
        (a==b)&&(b==c)&&(a==c) -> println(10000 + a*1000)
        (a==b)||(a==c) -> println(1000 + a*100)
        b==c -> println(1000 + b*100)
        else -> println(maxOf(a,b,c)*100)
    }
}