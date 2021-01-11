package day15

import swap

fun sortColors(nums: IntArray): Unit {
    var iter = 0
    var lo = 0
    var hi = nums.lastIndex
    while (iter <= hi) {
        when (nums[iter]) {
            0 -> swap(nums, iter++, lo++)
            2 -> swap(nums, iter, hi--)
            else -> iter++
        }
    }
}