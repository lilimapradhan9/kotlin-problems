package day5

val digitToLetterMap = mapOf(
    2 to listOf('a', 'b', 'c'),
    3 to listOf('d', 'e', 'f'),
    4 to listOf('g', 'h', 'i'),
    5 to listOf('j', 'k', 'l'),
    6 to listOf('m', 'n', 'o'),
    7 to listOf('p', 'q', 'r', 's'),
    8 to listOf('t', 'u', 'v'),
    9 to listOf('w', 'x', 'y', 'z')
)


fun letterCombinations(digits: String): List<String> {
    val result = mutableListOf<String>()
    if (digits.isEmpty()) return result

    addAllPermutations(digits, "", 0, result)

    return result
}

fun addAllPermutations(digits: String, permutation: String, k: Int, result: MutableList<String>) {
    if (k == digits.length) {
        result.add(permutation)
        return
    }

    val characters = digitToLetterMap.getValue(digits[k].toString().toInt())

    for (element in characters) {
        addAllPermutations(digits, permutation + element, k + 1, result)
    }
}

