package dayFolders.day17

import dayFolders.models.TreeNode

fun isValidBST(root: TreeNode?): Boolean {
    return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE)
}

private fun isValidBST(root: TreeNode?, min: Long, max: Long): Boolean {
    if (root == null)
        return true

    if (root.`val` >= max || root.`val` <= min)
        return false

    return isValidBST(root.left, min, root.`val`.toLong()) &&
            isValidBST(root.right, root.`val`.toLong(), max)
}