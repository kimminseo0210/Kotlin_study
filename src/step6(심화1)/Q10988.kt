package `step6(심화1)`

fun main() {
    val reader = System.`in`.bufferedReader()
    val writer = System.out.bufferedWriter()

    val palindromeString = reader.readLine() ?: ""

    // 실무에서 원하는 스타일이 됬음
    // == 이걸루 비교해도 되는데 contentEquals를 사용하여 내용물을 비교한다는걸 알림
    writer.write(if (palindromeString.contentEquals(palindromeString.reversed())) "1" else "0")

//    writer.write(palindrome(reader.readLine() ?: "").toString())

    writer.flush()
    writer.close()
    reader.close()
}

// 초초초초 고성능이 필요할때
fun palindrome(s: String): Int {
    var left = 0;
    var right = s.length - 1;
    while (left < right) {
        if (s[left] != s[right]) return 0
        left++
        right--
    }
    return 1
}