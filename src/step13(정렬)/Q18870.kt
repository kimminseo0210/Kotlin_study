package `step13(정렬)`

import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val inputNum = br.readLine().toInt()

    val st = StringTokenizer(br.readLine())
    val numList = IntArray(inputNum) {
        st.nextToken().toInt()
    }
    val sortedList = numList.clone().distinct().sorted()

    val rankMap = HashMap<Int, Int>()

    for ((index, value) in sortedList.withIndex()) {
        rankMap[value] = index
    }

    for (num in numList) {
        bw.write("${rankMap[num]} ")
    }

//    for ( i in numList.indices) {
//        var count = 0
//
//        for ( j in sortedList.indices) {
//            if (numList[i] > sortedList[j]) count++
//        }
//        bw.write("$count ")
//    }

    bw.flush()
    bw.close()
}