package `step6(심화1)`

import java.util.StringTokenizer

fun main() {
    val reader = System.`in`.bufferedReader()
    val writer = System.out.bufferedWriter()

    var totalSum = 0.0
    var totalCredit = 0.0

    repeat (20) {
        val inputSubject = reader.readLine() ?: return@repeat
        val st = StringTokenizer(inputSubject)

        val subject = st.nextToken()
        val credit = st.nextToken().toDouble()
        val grade = st.nextToken()

        if (grade == "P") return@repeat

        val score = when(grade) {
            "A+" -> 4.5
            "A0" -> 4.0
            "B+" -> 3.5
            "B0" -> 3.0
            "C+" -> 2.5
            "C0" -> 2.0
            "D+" -> 1.5
            "D0" -> 1.0
            "F" -> 0.0
            else -> 0.0
        }
        totalSum += (credit * score)
        totalCredit += credit
    }
    writer.write("${totalSum / totalCredit}")
    writer.flush()
    writer.close()
    reader.close()
}