package day1

fun removeDuplicates(nums: IntArray): Int {
    val arrayWithoutDuplicates = nums.toSet()
    return arrayWithoutDuplicates.size
}