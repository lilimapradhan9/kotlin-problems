fun swap(nums: IntArray, a: Int, b: Int) {
    nums[a] = nums[b].also { nums[b] = nums[a] }
}
