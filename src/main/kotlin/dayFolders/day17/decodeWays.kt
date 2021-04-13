package dayFolders.day17

fun numDecodings(s: String): Int {
    if (s.isEmpty() || s[0] == '0') return 0
    val dp = IntArray(s.length + 1)
    dp[1] = 1
    dp[0] = dp[1]
    for (i in 2..s.length) {
        val first = s.substring(i - 1, i).toInt()
        val second = s.substring(i - 2, i).toInt()
        if (first in 1..9) dp[i] += dp[i - 1]
        if (second in 10..26) dp[i] += dp[i - 2]
    }
    return dp[s.length]
}