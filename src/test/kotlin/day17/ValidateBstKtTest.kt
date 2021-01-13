package day17

import models.TreeNode
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class ValidateBstKtTest {
    @Test
    fun `should return rhe inorder solution for 2,1,3`() {
        val root = TreeNode(2)
        root.left = TreeNode(1)
        root.right = TreeNode(3)

        val inorderTraversal = isValidBST(root)

        Assertions.assertEquals(true, inorderTraversal)
    }

    @Test
    fun `should return rhe inorder solution for 5,1,4,null,null,3,6`() {
        val root = TreeNode(5)
        root.left = TreeNode(1)
        root.right = TreeNode(4)
        root.right?.left = TreeNode(3)
        root.right?.right = TreeNode(6)

        val inorderTraversal = isValidBST(root)

        Assertions.assertEquals(false, inorderTraversal)
    }
}