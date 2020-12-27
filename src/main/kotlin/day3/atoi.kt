package day3

import java.math.BigInteger

fun atoi(s: String): Int {
    var result = ""
    val input = s.trim()

    if (input.isEmpty()) return 0
    if (startIsNotValid(input)) return 0

    for (i in input.indices) {
        if (validInput(input, i)) {
            if ((input[i] == '-' || input[i] == '+') && result.isNotEmpty()) break
            result += input[i]
        } else break
    }

    if (result.toBigDecimalOrNull() == null) return 0
    if (BigInteger(result) > BigInteger(Integer.MAX_VALUE.toString())) return Integer.MAX_VALUE
    if (BigInteger(result) < BigInteger(Integer.MIN_VALUE.toString())) return Integer.MIN_VALUE
    return result.toInt()
}

private fun validInput(s: String, i: Int) = s[i].isDigit() || s[i] == '-' || s[i] == '+'

fun startIsNotValid(s: String): Boolean {
    return !validInput(s, 0)
}
