package step3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = br.readLine().toInt()
    var answer = 0;
    repeat(n) {
        answer += it+1
    }

    /*
    1.
    val sum = (1..n).sum()

    2.
    (1..n).forEach {
        answer += it // 여기서 it 은 1,2,3,...
    }

    3.
    for (i in 1..n) {
        answer += i
    }
     */
    println(answer)
}