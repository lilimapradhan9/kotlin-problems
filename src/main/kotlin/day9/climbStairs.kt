package day9

fun climbStairs(n: Int): Int {
    val memo = Array(n + 1) { 0 }
    memo.forEachIndexed { index, _ ->
        when (index) {
            0 -> memo[index] = 0
            1 -> memo[index] = 1
            2 -> memo[index] = 2
            else -> memo[index] = memo[index - 1] + memo[index - 2]
        }
    }
    return memo[n]
}