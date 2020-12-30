package day6

import models.ListNode
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MergeTwoListsKtTest {
    @Test
    fun `merge lists 1,2,4 and 1,3,4`() {
        val firstList = ListNode(1)
        firstList.next = ListNode(2)
        firstList.next?.next = ListNode(4)

        val secondList = ListNode(1)
        secondList.next = ListNode(3)
        secondList.next?.next = ListNode(4)

        val output = mergeTwoLists(firstList, secondList)

        Assertions.assertEquals(1, nthNodeValue(output, 0))
        Assertions.assertEquals(1, nthNodeValue(output, 1))
        Assertions.assertEquals(2, nthNodeValue(output, 2))
        Assertions.assertEquals(3, nthNodeValue(output, 3))
        Assertions.assertEquals(4, nthNodeValue(output, 4))
        Assertions.assertEquals(4, nthNodeValue(output, 5))
    }

    @Test
    fun `merge two empty lists`() {
        val firstList = null
        val secondList = null

        val output = mergeTwoLists(firstList, secondList)

        Assertions.assertEquals(null, output)
    }

    @Test
    fun `merge empty list and non empty list`() {
        val firstList = null
        val secondList = ListNode(0)

        val output = mergeTwoLists(firstList, secondList)

        Assertions.assertEquals(0, output?.`val`)
    }

    private fun nthNodeValue(output: ListNode?, n: Int): Int? {
        var node = output
        for (i in 0 until n) node = node?.next
        return node?.`val`
    }
}