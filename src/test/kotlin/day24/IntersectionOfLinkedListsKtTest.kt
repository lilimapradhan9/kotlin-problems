package day24

import models.ListNode
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class IntersectionOfLinkedListsKtTest {
    @Test
    fun `return the intersection for 4,1,8,4,5 and 5,6,1,8,4,5`() {
        val list1 = ListNode(4)
        list1.next = ListNode(1)
        val commonNode = ListNode(8)
        list1.next?.next = commonNode
        list1.next?.next?.next = ListNode(4)
        list1.next?.next?.next?.next = ListNode(5)
        val list2 = ListNode(5)
        list2.next = ListNode(6)
        list2.next?.next = ListNode(1)
        list2.next?.next?.next = commonNode
        list2.next?.next?.next?.next = ListNode(4)
        list2.next?.next?.next?.next?.next = ListNode(5)

        val intersectionNode = getIntersectionNode(list1, list2)

        Assertions.assertEquals(8, intersectionNode?.`val`)
    }

    @Test
    fun `return the intersection for 1,9,1,2,4 and 3,2,4`() {
        val list1 = ListNode(1)
        list1.next = ListNode(9)
        list1.next?.next = ListNode(1)
        val commonNode = ListNode(2)
        list1.next?.next?.next = commonNode
        list1.next?.next?.next?.next = ListNode(4)
        val list2 = ListNode(3)
        list2.next = commonNode
        list2.next?.next = ListNode(4)

        val intersectionNode = getIntersectionNode(list1, list2)

        Assertions.assertEquals(2, intersectionNode?.`val`)
    }

    @Test
    fun `return the intersection for 2,6,4 and 1,5`() {
        val list1 = ListNode(2)
        list1.next = ListNode(6)
        list1.next?.next = ListNode(4)
        val list2 = ListNode(1)
        list2.next = ListNode(5)

        val intersectionNode = getIntersectionNode(list1, list2)

        Assertions.assertEquals(null, intersectionNode)
    }

    @Test
    fun `return the intersection for 4,1,8,4,5 and 5,6,1,8,4,5 using length solution`() {
        val list1 = ListNode(4)
        list1.next = ListNode(1)
        val commonNode = ListNode(8)
        list1.next?.next = commonNode
        list1.next?.next?.next = ListNode(4)
        list1.next?.next?.next?.next = ListNode(5)
        val list2 = ListNode(5)
        list2.next = ListNode(6)
        list2.next?.next = ListNode(1)
        list2.next?.next?.next = commonNode
        list2.next?.next?.next?.next = ListNode(4)
        list2.next?.next?.next?.next?.next = ListNode(5)

        val intersectionNode = getIntersectionNodeUsingLength(list1, list2)

        Assertions.assertEquals(8, intersectionNode?.`val`)
    }
}