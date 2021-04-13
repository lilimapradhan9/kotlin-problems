package dayFolders.day18

import dayFolders.models.TreeNode
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ZigZagOrderTraversalKtTest {
    @Test
    fun `should return the zigzag order solution for 3,9,20,null,null,15,7`() {
        val root = TreeNode(3)
        root.left = TreeNode(9)
        root.right = TreeNode(20)
        root.right?.left = TreeNode(15)
        root.right?.right = TreeNode(7)

        val inorderTraversal = zigzagLevelOrder(root)

        Assertions.assertEquals(listOf(listOf(3), listOf(20, 9), listOf(15, 7)), inorderTraversal)
    }
}