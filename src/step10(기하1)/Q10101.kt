package `step10(기하1)`

fun main() {
    val br = System.`in`.bufferedReader()

    val angle1 = br.readLine().toInt()
    val angle2 = br.readLine().toInt()
    val angle3 = br.readLine().toInt()

    val result = angle1 + angle2 + angle3

    println(triangleType(angle1, angle2, angle3))
}

private fun triangleType(a1: Int, a2: Int, a3: Int): String {
    var triangle = ""
    val result = a1 + a2 + a3

    if (result == 180) {
        if (a1 == a2 && a2 == a3) triangle = "Equilateral"
        else if (a1 == a2 || a2 == a3 || a1 == a3) triangle = "Isosceles"
        else triangle = "Scalene"
    } else {
        triangle = "Error"
    }
    return triangle
}