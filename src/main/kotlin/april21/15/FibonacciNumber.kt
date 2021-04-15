package april21.`15`

val memo = IntArray(31)
fun fib(n: Int): Int {// Edge case
    if (n <= 1) return n
    if (memo[n] != 0) return memo[n]

    val result = fib(n - 1) + fib(n - 2)
    memo[n] = result
    return result
}
