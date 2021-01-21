package day25

fun titleToNumber(s: String): Int {
    if (s.isBlank()) return 0

    var number = 0
    var multiplier = 1

    for (i in s.lastIndex downTo 0) {
        val charValue = s[i].toInt() - 64
        number += charValue * multiplier
        multiplier *= 26
    }
    return number
}