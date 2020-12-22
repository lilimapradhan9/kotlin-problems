package day2

fun longestPalindrome(s: String): String {
    var longestPalindrome = ""

    for (i in s.indices) {
        for (j in i until s.length) {
            val substring = s.substring(i..j)
            if (substring == substring.reversed()) {
                if (substring.length > longestPalindrome.length) {
                    longestPalindrome = substring
                }
            }
        }
    }
    return longestPalindrome
}