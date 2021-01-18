package day22

import models.ListNode
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class LinkedListCycleKtTest {
    @Test
    fun `should return true when list has cycle`() {
        val head = ListNode(3)
        val secondNode = ListNode(2)
        head.next = secondNode
        head.next?.next = ListNode(0)
        head.next?.next?.next = ListNode(-4)
        head.next?.next?.next?.next = secondNode

        val hasCycle = hasCycle(head)

        Assertions.assertTrue(hasCycle)
    }

    @Test
    fun `should return true when list has cycle and two elements`() {
        val head = ListNode(1)
        val secondNode = ListNode(2)
        head.next = secondNode
        secondNode.next = head

        val hasCycle = hasCycle(head)

        Assertions.assertTrue(hasCycle)
    }

    @Test
    fun `should return false when list has no cycle`() {
        val head = ListNode(1)

        val hasCycle = hasCycle(head)

        Assertions.assertFalse(hasCycle)
    }
}