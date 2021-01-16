package day20

import models.TreeNode

var sum = Integer.MIN_VALUE

fun maxPathSum(root: TreeNode?): Int {
    sum = Int.MIN_VALUE
    rec(root)
    return sum
}

fun rec(root: TreeNode?): Int {
    if (root == null) return 0
    val left = maxOf(rec(root.left), 0)
    val right = maxOf(rec(root.right), 0)
    sum = maxOf(root.`val` + left + right, sum)
    return maxOf(left, right) + root.`val`
}