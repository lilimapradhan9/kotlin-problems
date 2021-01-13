package day17

import models.TreeNode
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SymmetricTreeKtTest {
    @Test
    fun `should return rhe inorder solution for 1,2,2,3,4,4,3`() {
        val root = TreeNode(1)
        root.left = TreeNode(2)
        root.left?.left = TreeNode(3)
        root.left?.right = TreeNode(4)
        root.right = TreeNode(2)
        root.right?.left = TreeNode(4)
        root.right?.right = TreeNode(3)

        val inorderTraversal = isSymmetric(root)

        Assertions.assertEquals(true, inorderTraversal)
    }

    @Test
    fun `should return rhe inorder solution for 1,2,2,null,3,null,3`() {
        val root = TreeNode(1)
        root.left = TreeNode(2)
        root.right = TreeNode(2)
        root.left?.right = TreeNode(3)
        root.right?.right = TreeNode(3)

        val inorderTraversal = isSymmetric(root)

        Assertions.assertEquals(false, inorderTraversal)
    }
}