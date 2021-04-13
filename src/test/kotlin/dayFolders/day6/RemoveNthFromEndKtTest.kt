package dayFolders.day6

import dayFolders.models.ListNode
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class RemoveNthFromEndKtTest {
    @Test
    fun `should remove 2nd last from 1,2,3,4,5`() {
        val head = ListNode(1)
        head.next = ListNode(2)
        head.next?.next = ListNode(3)
        head.next?.next?.next = ListNode(4)
        head.next?.next?.next?.next = ListNode(5)

        val output = removeNthFromEnd(head, 2)

        Assertions.assertEquals(1, output?.`val`)
        Assertions.assertEquals(2, output?.next?.`val`)
        Assertions.assertEquals(3, output?.next?.next?.`val`)
        Assertions.assertEquals(5, output?.next?.next?.next?.`val`)
    }

    @Test
    fun `should remove 1st last from 1`() {
        val head = ListNode(1)

        val output = removeNthFromEnd(head, 1)

        Assertions.assertEquals(null, output)
    }

    @Test
    fun `should remove 1st last from 1,2`() {
        val head = ListNode(1)
        head.next = ListNode(2)

        val output = removeNthFromEnd(head, 1)

        Assertions.assertEquals(1, output?.`val`)
    }

    @Test
    fun `should remove 2nd last from 1,2`() {
        val head = ListNode(1)
        head.next = ListNode(2)

        val output = removeNthFromEnd(head, 2)

        Assertions.assertEquals(2, output?.`val`)
    }
}