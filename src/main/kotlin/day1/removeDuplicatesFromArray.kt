package day1

fun removeDuplicates(nums: IntArray): Int {
    if (nums.isEmpty()) return 0

    var index = 1
    var curVal = nums[0]

    for (i in nums.indices) {
        if (nums[i] != curVal) {
            curVal = nums[i]
            nums[index] = nums[i]
            index++
        }
    }

    return index
}