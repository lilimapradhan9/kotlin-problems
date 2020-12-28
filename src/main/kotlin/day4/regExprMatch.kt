package day4


fun isMatch(s: String, p: String): Boolean {
    val memo = Array(s.length + 1) { BooleanArray(p.length + 1) }

    memo[0][0] = true

    for (i in 1 until memo[0].size) {
        memo[0][i] = if (p[i - 1] == '*') memo[0][i - 2] else false
    }

    for (i in 1 until memo.size) {
        for (j in 1 until memo[0].size) {
            if (p[j - 1] == '.' || p[j - 1] == s[i - 1]) {
                memo[i][j] = memo[i - 1][j - 1]
            } else if (p[j - 1] == '*') {
                memo[i][j] = memo[i][j - 2]
                if (p[j - 2] == '.' || p[j - 2] == s[i - 1]) {
                    memo[i][j] = memo[i][j] or memo[i - 1][j]
                }
            } else
                memo[i][j] = false
        }
    }

    return memo[s.length][p.length]
}