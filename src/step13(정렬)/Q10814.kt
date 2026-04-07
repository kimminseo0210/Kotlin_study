package `step13(정렬)`

import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val inputNum = br.readLine().toInt()

    val peopleList = Array(inputNum) {
        val st = StringTokenizer(br.readLine())
        arrayOf(
            st.nextToken(),
            st.nextToken()
        )
    }
        .sortedWith { p1, p2 ->
            val age1 = p1[0].toInt()
            val age2 = p2[0].toInt()
            // 2순위 나이가 같으면 들어온순 정렬
            // 위치 바꾸기 x -> 0 리턴
            if (age1 == age2) {
                0
            } else { // 1순위 나이순 정렬
                age1 - age2
            }
        }

    /** 실무형
     * val peopleList = List(inputNum) {
     *      val st = StringTokenizer(br.readLine())
     *      Pair( st.nextToken().toInt(), st.nextToken())
     * }
     *
     * val sortedPeople = peopleList.sortedBy { it.first }
     */

    for (person in peopleList) {
        bw.write("${person[0]} ${person[1]}")
        bw.newLine()
    }
    bw.flush()
    bw.close()
}