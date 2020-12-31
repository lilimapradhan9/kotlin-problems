package day7

import models.ListNode
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import util.nthNodeValue

class MergeKListsKtTest {
    @Test
    fun `should merge 1,4,5 ,1,3,4, 2,6`() {
        val list1 = ListNode(1)
        list1.next = ListNode(4)
        list1.next?.next = ListNode(5)

        val list2 = ListNode(1)
        list2.next = ListNode(3)
        list2.next?.next = ListNode(4)

        val list3 = ListNode(2)
        list3.next = ListNode(6)

        val result = mergeKLists(arrayOf(list1, list2, list3))

        Assertions.assertEquals(1, nthNodeValue(result, 0))
        Assertions.assertEquals(1, nthNodeValue(result, 1))
        Assertions.assertEquals(2, nthNodeValue(result, 2))
        Assertions.assertEquals(3, nthNodeValue(result, 3))
        Assertions.assertEquals(4, nthNodeValue(result, 4))
        Assertions.assertEquals(4, nthNodeValue(result, 5))
        Assertions.assertEquals(5, nthNodeValue(result, 6))
        Assertions.assertEquals(6, nthNodeValue(result, 7))
    }

    @Test
    fun `should merge empty`() {
        val result = mergeKLists(arrayOf())

        Assertions.assertEquals(null, result)
    }

    @Test
    fun `should merge empty list`() {
        val result = mergeKLists(arrayOf(null))

        Assertions.assertEquals(null, result)
    }
}