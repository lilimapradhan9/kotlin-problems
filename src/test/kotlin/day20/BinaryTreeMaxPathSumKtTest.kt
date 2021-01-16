package day20

import models.TreeNode
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class BinaryTreeMaxPathSumKtTest {
    @Test
    fun `should return the max path sum for 1,2,3`() {
        val node = TreeNode(2)
        node.left = TreeNode(1)
        node.right = TreeNode(3)

        val maxSum = maxPathSum(node)

        Assertions.assertEquals(6, maxSum)
    }

    @Test
    fun `should return the max path sum for -10,9,20,null,null,15,7`() {
        val node = TreeNode(-10)
        node.left = TreeNode(9)
        node.right = TreeNode(20)
        node.right?.left = TreeNode(15)
        node.right?.right = TreeNode(7)

        val maxSum = maxPathSum(node)

        Assertions.assertEquals(42, maxSum)
    }
}