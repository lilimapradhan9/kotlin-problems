package day17

import models.TreeNode

fun inorderTraversal(root: TreeNode?): List<Int> {
    return inOrder(root, mutableListOf())
}

fun inOrder(root: TreeNode?, numberList: MutableList<Int>): List<Int> {
    if (root == null) return numberList
    inOrder(root.left, numberList)
    root.`val`.let { numberList.add(it) }
    inOrder(root.right, numberList)
    return numberList
}
