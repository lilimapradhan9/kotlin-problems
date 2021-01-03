package day10

fun firstMissingPositive(nums: IntArray): Int {
    val n = nums.size
    val present = BooleanArray(n + 1)

    for (i in 0 until n) {
        if (nums[i] in 1..n) present[nums[i]] = true
    }

    for (i in 1..n) if (!present[i]) return i

    return n + 1
}