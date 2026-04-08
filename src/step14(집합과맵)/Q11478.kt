package `step14(집합과맵)`

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val inputStr = br.readLine() ?: ""

    // 서로 다른은 HashSet을 사용 ㄱㄱ
    val strSet = HashSet<String>()

    // substring(a,b) 문자열을 a~b 까지 자름
    // 자르기 시작할 위치
    for ( i in 0 until inputStr.length ) {
        // 자를 끝 위치
        for (j in i+1.. inputStr.length ) {
            var cutWord = inputStr.substring(i, j)

            strSet.add(cutWord)
        }
    }

    bw.write((strSet.size).toString())

    bw.flush()
    bw.close()
    br.close()
}