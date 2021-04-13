package dayFolders.day14

fun uniquePaths(m: Int, n: Int): Int {
    if (m == 1 && n == 1) return 1
    val dp = Array(m) { IntArray(n) }
    for (i in 0 until m) {
        for (j in 0 until n) {
            if (i == 0 || j == 0) {
                dp[i][0] = 1
                dp[0][j] = 1
                dp[0][0] = 0
            } else {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1]
            }
        }
    }
    return dp[m - 1][n - 1]
}