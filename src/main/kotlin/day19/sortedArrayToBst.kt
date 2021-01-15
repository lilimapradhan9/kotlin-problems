package day19

import models.TreeNode

fun sortedArrayToBST(nums: IntArray): TreeNode? {
    if (nums.isEmpty()) return null
    if (nums.size == 1) return TreeNode(nums[0])
    return TreeNode(nums[nums.size/2]).apply {
        left  = sortedArrayToBST(nums.sliceArray(0 until nums.size/2))
        right = sortedArrayToBST(nums.sliceArray(nums.size/2+1 until nums.size))
    }
}