package april21.a18

import dayFolders.models.ListNode
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import util.nthNodeValue

class SwapNodesInPairsKtTest {
    @Test
    fun `should swap given linked list`() {
        val list = ListNode(1)
        list.next = ListNode(2)
        list.next?.next = ListNode(3)
        list.next?.next?.next = ListNode(4)

        val result = swapPairs(list)

        Assertions.assertEquals(2, result?.`val`)
        Assertions.assertEquals(1, nthNodeValue(result, 1))
        Assertions.assertEquals(4, nthNodeValue(result, 2))
        Assertions.assertEquals(3, nthNodeValue(result, 3))
    }

    @Test
    fun `should swap linked list with 0 elements`() {
        val result = swapPairs(null)

        Assertions.assertEquals(null, result?.`val`)
    }

    @Test
    fun `should swap linked list with 1 element`() {
        val result = swapPairs(ListNode(1))

        Assertions.assertEquals(1, result?.`val`)
    }
}
