package dayFolders.day17

import dayFolders.models.TreeNode
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class InOrderTraversalKtTest {
    @Test
    fun `should return rhe inorder solution for 1,null,2,3`() {
        val root = TreeNode(1)
        root.right = TreeNode(2)
        root.right?.left = TreeNode(3)

        val inorderTraversal = inorderTraversal(root)

        Assertions.assertEquals(listOf(1, 3, 2), inorderTraversal)
    }

    @Test
    fun `should return rhe inorder solution for 1,2`() {
        val root = TreeNode(1)
        root.left = TreeNode(2)

        val inorderTraversal = inorderTraversal(root)

        Assertions.assertEquals(listOf(2, 1), inorderTraversal)
    }

    @Test
    fun `should return rhe inorder solution for 1,null,2`() {
        val root = TreeNode(1)
        root.right = TreeNode(2)

        val inorderTraversal = inorderTraversal(root)

        Assertions.assertEquals(listOf(1, 2), inorderTraversal)
    }
}