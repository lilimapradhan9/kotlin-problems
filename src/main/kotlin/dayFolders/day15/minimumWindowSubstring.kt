package dayFolders.day15

import java.util.*

fun minWindow(s: String, t: String): String {
    if (s.isEmpty() || t.isEmpty()) {
        return ""
    }

    val requiredLetterCount: MutableMap<Char, Int?> = HashMap()
    for (index in t.indices) {
        val count = requiredLetterCount.getOrDefault(t[index], 0)!!
        requiredLetterCount[t[index]] = count + 1
    }

    var windowLeft = 0
    var windowRight = 0

    var foundLettersCount = 0

    val windowLetterCount: MutableMap<Char, Int> = HashMap()

    val result = intArrayOf(-1, 0, 0)
    while (windowRight < s.length) {
        var letter = s[windowRight]
        val count = windowLetterCount.getOrDefault(letter, 0)
        windowLetterCount[letter] = count + 1

        if (requiredLetterCount.containsKey(letter) && windowLetterCount[letter]!!.toInt() == requiredLetterCount[letter]!!.toInt()) {
            foundLettersCount++
        }

        while (windowLeft <= windowRight && foundLettersCount == requiredLetterCount.size) {
            letter = s[windowLeft]
            if (result[0] == -1 || windowRight - windowLeft + 1 < result[0]) {
                result[0] = windowRight - windowLeft + 1
                result[1] = windowLeft
                result[2] = windowRight
            }

            windowLetterCount[letter] = windowLetterCount[letter]!! - 1
            if (requiredLetterCount.containsKey(letter) && windowLetterCount[letter]!!.toInt() < requiredLetterCount[letter]!!.toInt()) {
                foundLettersCount--
            }

            windowLeft++
        }

        windowRight++
    }
    return if (result[0] == -1) "" else s.substring(result[1], result[2] + 1)
}