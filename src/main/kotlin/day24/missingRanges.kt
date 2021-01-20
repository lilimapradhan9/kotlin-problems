package day24


fun findMissingRanges(nums: IntArray, lower: Int, upper: Int): MutableList<IntArray> {
    val result: MutableList<IntArray> = mutableListOf()
    if (nums.isEmpty()) {
        outputToResult(lower, upper, result)
        return result
    }

    if (nums[0] - lower > 0) outputToResult(lower, nums[0] - 1, result)

    for (i in 1 until nums.size) {
        if (nums[i] - nums[i - 1] > 1) {
            outputToResult(nums[i - 1] + 1, nums[i] - 1, result)
        }
    }

    if (upper - nums[nums.size - 1] > 0) {
        outputToResult(nums[nums.size - 1] + 1, upper, result)
    }

    return result
}

private fun outputToResult(start: Int, end: Int, result: MutableList<IntArray>) {
    result.add(
        if (start == end) intArrayOf(start)
        else intArrayOf(start, end)
    )
}