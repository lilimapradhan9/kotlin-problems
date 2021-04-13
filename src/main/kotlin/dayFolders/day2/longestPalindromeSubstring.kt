package dayFolders.day2

fun longestPalindrome(s: String): String? {
    if (s.isEmpty()) return ""

    val inputLength = s.length
    var start = 0
    var end = 0

    val memo = Array(inputLength) { BooleanArray(inputLength) }

    for (i in inputLength - 1 downTo 0) {
        for (j in i until inputLength) {
            memo[i][j] = s[i] == s[j] && (j - i < 3 || memo[i + 1][j - 1])
            if (memo[i][j] && j - i > end - start) {
                start = i
                end = j
            }
        }
    }
    return s.substring(start, end + 1)
}

