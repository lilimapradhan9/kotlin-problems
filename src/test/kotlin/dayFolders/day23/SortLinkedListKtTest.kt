package dayFolders.day23

import dayFolders.models.ListNode
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SortLinkedListKtTest {
    @Test
    fun `should sort 4,2,1,3`() {
        val head = ListNode(4)
        head.next = ListNode(2)
        head.next?.next = ListNode(1)
        head.next?.next?.next = ListNode(3)

        val sortList = sortList(head)

        Assertions.assertEquals(1, sortList?.`val`)
        Assertions.assertEquals(2, sortList?.next?.`val`)
        Assertions.assertEquals(3, sortList?.next?.next?.`val`)
        Assertions.assertEquals(4, sortList?.next?.next?.next?.`val`)
    }

    @Test
    fun `should sort -1,5,3,4,0`() {
        val head = ListNode(-1)
        head.next = ListNode(5)
        head.next?.next = ListNode(3)
        head.next?.next?.next = ListNode(4)
        head.next?.next?.next?.next = ListNode(0)

        val sortList = sortList(head)

        Assertions.assertEquals(-1, sortList?.`val`)
        Assertions.assertEquals(0, sortList?.next?.`val`)
        Assertions.assertEquals(3, sortList?.next?.next?.`val`)
        Assertions.assertEquals(4, sortList?.next?.next?.next?.`val`)
        Assertions.assertEquals(5, sortList?.next?.next?.next?.next?.`val`)
    }
}