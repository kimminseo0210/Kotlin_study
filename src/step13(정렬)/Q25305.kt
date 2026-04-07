package `step13(정렬)`

import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val st = StringTokenizer(br.readLine() ?: "")

    val studentsNum = st.nextToken().toInt()
    val getPriseStudentNum = st.nextToken().toInt()

    val st2 = StringTokenizer(br.readLine() ?: "")
    val studentArray = IntArray(studentsNum) {
        st2.nextToken().toInt()
    }.apply { sort() }

    bw.write(
        studentArray[studentArray.size - getPriseStudentNum]
            .toString()
    )
    bw.flush()
}