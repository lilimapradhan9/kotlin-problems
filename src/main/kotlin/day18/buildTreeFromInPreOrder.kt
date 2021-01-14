package day18

import models.TreeNode

fun findRoot(root: Int, inorder: IntArray): Int {
    for (i in inorder.indices) {
        if (root == inorder[i]) return i
    }
    return -1
}

fun construct(preorder: IntArray, inorder: IntArray, start: Int, end: Int, index: Int): TreeNode? {
    if (index >= preorder.size || start > end) return null

    val ind = findRoot(preorder[index], inorder)
    val root = TreeNode(inorder[ind])

    root.left = construct(preorder, inorder, start, ind - 1, index + 1)
    root.right = construct(preorder, inorder, ind + 1, end, index + ind + 1 - start)

    return root
}

fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode? {
    return construct(preorder, inorder, 0, inorder.size, 0)
}