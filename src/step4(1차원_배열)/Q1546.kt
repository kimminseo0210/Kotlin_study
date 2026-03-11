package `step4(1차원_배열)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val st = StringTokenizer(br.readLine())

    val testArray = DoubleArray(n) {
        st.nextToken().toDouble()
    }

    val maxScore = testArray.max()
    /*var avgScore = 0.0
    repeat(n) {
        testArray[it] = testArray[it] / maxScore * 100
        avgScore += testArray[it]
    }*/
    val avgScore = (testArray.sum() / maxScore * 100) / n

    bw.write((avgScore / n).toString())
    bw.newLine()

    bw.flush()
    bw.close()
}