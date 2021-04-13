package dayFolders.day8

fun searchRange(nums: IntArray, target: Int): IntArray {
    val targetRange = intArrayOf(-1, -1)

    for (i in nums.indices) {
        if (nums[i] == target) {
            targetRange[0] = i
            break
        }
    }

    if (targetRange[0] == -1) {
        return targetRange
    }

    for (j in nums.indices.reversed()) {
        if (nums[j] == target) {
            targetRange[1] = j
            break
        }
    }
    return targetRange
}