package `step6(심화1)`

fun main() {
    val reader = System.`in`.bufferedReader()
    val writer = System.out.bufferedWriter()

    val n = reader.readLine()?.toInt() ?: 0
    var groupWordCount = 0

    repeat(n) {
        val word = reader.readLine() ?: ""

        // 그룹 판별 로직 호출
        if (checkGroupWord(word)) {
            groupWordCount++
        }
    }
    writer.write(groupWordCount.toString())
    writer.flush()
    writer.close()
    reader.close()
}

// 실무형 스타일 : 판별 로직을 별도 함수로 분리하면 코드의 가독성이 올라감
fun checkGroupWord(word: String): Boolean {
    val seen = BooleanArray(26) // 알파벳 등장 여부 기록
    var prevChar = ' '         // 직전 글자 보관용

    for (i in word.indices) {
        val currentChar = word[i]

        // 1. 현재 글자가 직전 글자와 다를 때만 체크 (새로운 알파벳의 등장)
        if (prevChar != currentChar) {

            // 2. 중요: 새로 등장한 글자가 이미 예전에 나왔던 적(true)이 있다면?
            if (seen[currentChar - 'a']) {
                return false // 즉시 그룹 단어가 아님을 반환 (Early Return)
            }

            // 3. 처음 등장했으니 true로 표시
            seen[currentChar - 'a'] = true
        }

        // 4. 현재 글자를 직전 글자로 업데이트
        prevChar = currentChar
    }

    return true // 끝까지 위반 사례가 없었다면 그룹 단어!
}