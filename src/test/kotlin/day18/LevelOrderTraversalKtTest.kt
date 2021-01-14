package day18

import models.TreeNode
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class LevelOrderTraversalKtTest {
    @ExperimentalStdlibApi
    @Test
    fun `should return the level order solution for 3,9,20,null,null,15,7`() {
        val root = TreeNode(1)
        root.left = TreeNode(9)
        root.right = TreeNode(20)
        root.right?.left = TreeNode(15)
        root.right?.right = TreeNode(7)

        val inorderTraversal = levelOrder(root)

        Assertions.assertEquals(listOf(listOf(1), listOf(9, 20), listOf(15, 7)), inorderTraversal)
    }
}