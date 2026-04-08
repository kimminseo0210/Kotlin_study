package `step14(집합과맵)`

import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val st = StringTokenizer(br.readLine() ?: "")
    val aNum = st.nextToken().toInt()
    val bNum = st.nextToken().toInt()
    var result = 0

    val A = HashSet<Int>(aNum)
    val stA = StringTokenizer(br.readLine() ?: "")
    repeat(aNum) {
        A.add(stA.nextToken().toInt())
    }
/* 1 방법 : Set 두개
    val B = HashSet<Int>(bNum)
    val stB = StringTokenizer(br.readLine() ?: "")
    repeat(bNum) {
        B.add(stB.nextToken().toInt())
    }
    // A - B
    for (i in B) {
        if (!A.contains(i)) result++
    }
    // B - A
    for (i in A) {
        if (!B.contains(i)) result++
    }
 */
    /* 대칭 차집합 공식 이용
    var intersectCount = 0
    val stB = StringTokenizer(br.readLine() ?: "")
    repeat(bNum) {
        val num = stB.nextToken().toInt()
        if (A.contains(num)) intersectCount++
    }
    // 대칭 차집합 마법 공식 : (A크기 + B크기) - (교집 * 2)
    result = aNum + bNum - (intersectCount * 2)
*/
    val B = HashSet<Int>(bNum)
    val stB = StringTokenizer(br.readLine() ?: "")
    repeat(bNum) {
        B.add(stB.nextToken().toInt())
    }
    val resultList = (A subtract B) union (B subtract A)
    bw.write("${resultList.size}")

//    bw.write("$result")

    bw.flush()
    bw.close()
    br.close()
}

/** Kotlin 참고용 지식
 * A subtract B == A-b 차집합
 * union == 합집합
 * intersect == 교집합
 */