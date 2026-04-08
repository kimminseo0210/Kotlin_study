package `step12(브루트포스)`

fun main() {
    val br = System.`in`.bufferedReader()

    val n = br.readLine().toInt()

    println(decompositionSum(n))
}

private fun decompositionSum(n : Int) : Int {

    for ( i in 1..n) {
        var currentSum = i

        val digits = i.toString().toCharArray()
        for (digit in digits) {
            currentSum += digit.digitToInt()
        }

        if (currentSum == n) return i
    }
    return 0
}
// 성능 최적화
//private fun decompositionSum(n : Int) : Int {
//
//    for ( i in 1..n) {
//        var temp = i
//        var sum = i
//
//        while ( temp > 0) {
//            sum += temp % 10
//            tem /= 10
//        }
//
//        if (sum == n) return i
//    }
//    return 0
//}
