package `step9(약수,배수와_소수1)`

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val sb = StringBuilder()

    val firstInputNum = br.readLine().toInt()
    val secondInputNum = br.readLine().toInt()

    var isPrimeArray = mutableListOf<Int>()

    for (i in firstInputNum .. secondInputNum) {
        if (isPrime(i)) isPrimeArray.add(i)
    }
    if (isPrimeArray.isEmpty()) sb.append("-1")
    else sb.append(isPrimeArray.sum()).append('\n').append(isPrimeArray[0])
    // min()도 가능하지만 이미 오름차순이니 [0], first() 를 이용하여 속도를 줄인다
    bw.write(sb.toString())
    bw.flush()
    bw.close()
}

private fun isPrime(num: Int) : Boolean {
    if (num < 2) return false
    var i = 2
    while (i * i <= num) {
        if (num % i == 0) return false
        i++
    }
    return true
}