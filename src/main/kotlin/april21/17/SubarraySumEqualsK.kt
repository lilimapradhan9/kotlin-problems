package april21.`17`

fun subarraySum(nums: IntArray, k: Int): Int {
    val prefixSum = hashMapOf(0 to 1)

    var count = 0
    var sum = 0

    for (num in nums) {
        sum += num

        prefixSum[sum - k]?.let { count += it }
        prefixSum[sum] = (prefixSum[sum] ?: 0) + 1
    }

    return count
}