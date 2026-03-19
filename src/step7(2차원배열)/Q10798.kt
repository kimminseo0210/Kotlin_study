package `step7(2차원배열)`

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()
    var sb = StringBuilder()

    var matrix = Array(5) { CharArray(15) { ' ' } }

    repeat(5) { i ->
        val strLine = br.readLine() ?: ""
        for ( j in strLine.indices ) {
            matrix[i][j] = strLine[j]
        }
    }

    for ( col in 0 until 15 ) {
        for ( row in 0 until 5 ) {
            if (matrix[row][col] != ' ' && matrix[row][col] != '\u0000') {
                sb.append(matrix[row][col])
            }
        }
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()

}