package dayFolders.day27

fun rob(nums: IntArray): Int {
    if (nums.isEmpty()) return 0
    val memo = IntArray(nums.size + 1)
    memo[0] = 0
    memo[1] = nums[0]
    for (i in 1 until nums.size) {
        memo[i + 1] = Math.max(memo[i], memo[i - 1] + nums[i])
    }
    return memo[nums.size]
}