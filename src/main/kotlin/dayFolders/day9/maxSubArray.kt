package dayFolders.day9

fun maxSubArray(nums: IntArray): Int {
    if (nums.isEmpty()) return 0

    var maxSubArray = nums[0]
    var result = nums[0]

    for (i in 1 until nums.size) {
        maxSubArray = maxOf(maxSubArray + nums[i], nums[i])
        result = maxOf(result, maxSubArray)
    }

    return result
}