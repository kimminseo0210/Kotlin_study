package `step6(심화1)`


fun main() {
    val reader = System.`in`.bufferedReader()
    val writer = System.out.bufferedWriter()

    var input = reader.readLine() ?: ""

    val croatian = listOf("c=","c-","dz=","d-","lj","nj","s=","z=")

    for (alphabet in croatian) {
        input = input.replace(alphabet, "*")
    }

    writer.write("${input.length}")
    writer.flush()
    writer.close()
    reader.close()
}