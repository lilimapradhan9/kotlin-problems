package dayFolders.day19

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SortedArrayToBstKtTest {
    @Test
    fun `should create tree for -10,-3,0,5,9`() {
        val bst = sortedArrayToBST(intArrayOf(-10, -3, 0, 5, 9))

        Assertions.assertEquals(0, bst?.`val`)
        Assertions.assertEquals(-3, bst?.left?.`val`)
        Assertions.assertEquals(9, bst?.right?.`val`)
        Assertions.assertEquals(-10, bst?.left?.left?.`val`)
        Assertions.assertEquals(5, bst?.right?.left?.`val`)
    }
}