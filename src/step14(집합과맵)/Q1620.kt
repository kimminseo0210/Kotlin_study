package `step14(집합과맵)`

import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val st = StringTokenizer(br.readLine() ?: "")
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    // 1. 실무형 투트랙 주머니
    // HashMap 사이즈를 미리 n으로 지정해 메모리 효율 업
    val pokemonMap = HashMap<String, Int>()         // 이름으로 번호 찾기용
    val pokemonArray = Array(n + 1) { "" }   // 번호로 이름 찾기용

    for (i in 1..n) {
        val name = br.readLine() ?: ""
        pokemonMap[name] = i    // "피카츄" -> 25
        pokemonArray[i] = name  // 25 -> "피카츄"
    }

    repeat(m) {
        val input = br.readLine() ?: ""
        // 숫자라면 Int(num) 반환, 문자라면 Null(input) 반환
        val num = input.toIntOrNull() // 숫자일까 문자일까 ?

        if (num == null) { // 문자라면
            bw.write(pokemonMap[input].toString())
            bw.newLine()
        } else { // 숫자라면
            bw.write(pokemonArray[num])
            bw.newLine()
        }
    }

    bw.flush()
    bw.close()
    br.close()
}