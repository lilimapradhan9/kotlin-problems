package day25

fun reverseBits(n: Int): Int {
    val bits = IntArray(32)
    var index = 31
    var num = n
    var result = 0
    var multiplier = 1

    while (index > -1) {
        bits[index--] = if (num and 1 == 0) 0 else 1
        num = num shr 1
    }

    for (i in 0 until 32) {
        result += bits[i] * multiplier
        multiplier *= 2
    }

    return result
}