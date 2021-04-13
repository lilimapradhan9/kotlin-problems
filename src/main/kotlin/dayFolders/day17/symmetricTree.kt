package dayFolders.day17

import dayFolders.models.TreeNode

fun isSymmetric(root: TreeNode?): Boolean {
    return root?.let { areNodeMirror(root.left, root.right) } ?: true
}

private fun areNodeMirror(left: TreeNode?, right: TreeNode?): Boolean {
    return when {
        left === right -> true
        left?.`val` == right?.`val` -> {
            areNodeMirror(left?.left, right?.right) && areNodeMirror(left?.right, right?.left)
        }
        else -> false
    }
}