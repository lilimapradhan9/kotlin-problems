package day5

val symbolToValue = mapOf<Char, Int>(
    'I' to 1,
    'X' to 10,
    'V' to 5,
    'L' to 50,
    'C' to 100,
    'D' to 500,
    'M' to 1000
)

fun romanToInt(s: String): Int {
    val numbers = mutableListOf<Int>()
    for (i in s.indices) {
        numbers.add(symbolToValue.getValue(s[i]))
    }

    var sum = 0

    for (i in 0 until numbers.size - 1) {
        if (numbers[i] < numbers[i + 1]) sum -= numbers[i]
        else sum += numbers[i]
    }

    sum += numbers[numbers.size - 1]

    return sum
}