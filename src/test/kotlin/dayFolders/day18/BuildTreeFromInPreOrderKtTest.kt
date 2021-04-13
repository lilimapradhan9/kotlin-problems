package dayFolders.day18

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class BuildTreeFromInPreOrderKtTest {
    @Test
    fun `should construct tree using preorder 3,9,20,15,7 inorder 9,3,15,20,7`() {
        val tree = buildTree(intArrayOf(3, 9, 20, 15, 7), intArrayOf(9, 3, 15, 20, 7))

        Assertions.assertEquals(3, tree?.`val`)
        Assertions.assertEquals(9, tree?.left?.`val`)
        Assertions.assertEquals(20, tree?.right?.`val`)
        Assertions.assertEquals(15, tree?.right?.left?.`val`)
        Assertions.assertEquals(7, tree?.right?.right?.`val`)
    }
}