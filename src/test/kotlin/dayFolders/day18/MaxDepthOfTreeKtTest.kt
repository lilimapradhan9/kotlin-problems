package dayFolders.day18

import dayFolders.models.TreeNode
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MaxDepthOfTreeKtTest {
    @Test
    fun `should return the height for 3,9,20,null,null,15,7`() {
        val root = TreeNode(3)
        root.left = TreeNode(9)
        root.right = TreeNode(20)
        root.right?.left = TreeNode(15)
        root.right?.right = TreeNode(7)

        val maxDepth = maxDepth(root)

        Assertions.assertEquals(3, maxDepth)
    }

    @Test
    fun `should return the level order solution for 1,null,2`() {
        val root = TreeNode(1)
        root.right = TreeNode(2)

        val maxDepth = maxDepth(root)

        Assertions.assertEquals(2, maxDepth)
    }

    @Test
    fun `should return the level order solution for empty tree`() {
        val maxDepth = maxDepth(null)

        Assertions.assertEquals(0, maxDepth)
    }

    @Test
    fun `should return the level order solution for tree with 1 element`() {
        val maxDepth = maxDepth(TreeNode(1))

        Assertions.assertEquals(1, maxDepth)
    }
}