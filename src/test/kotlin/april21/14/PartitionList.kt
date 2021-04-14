package april21.`14`

import dayFolders.models.ListNode
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import util.nthNodeValue

class PartitionListTest {
    @Test
    fun `should partition 1,4,3,2,5,2`() {
        val list = ListNode(1)
        list.next = ListNode(4)
        list.next?.next = ListNode(3)
        list.next?.next?.next = ListNode(2)
        list.next?.next?.next?.next = ListNode(5)
        list.next?.next?.next?.next?.next = ListNode(2)

        val result = partition(list, 3)

        Assertions.assertEquals(1, result?.`val`)
        Assertions.assertEquals(2, nthNodeValue(result, 1))
        Assertions.assertEquals(2, nthNodeValue(result, 2))
        Assertions.assertEquals(4, nthNodeValue(result, 3))
        Assertions.assertEquals(3, nthNodeValue(result, 4))
        Assertions.assertEquals(5, nthNodeValue(result, 5))
    }

    @Test
    fun `should partition 2,1`() {
        val list = ListNode(2)
        list.next = ListNode(1)

        val result = partition(list, 2)

        Assertions.assertEquals(1, result?.`val`)
        Assertions.assertEquals(2, nthNodeValue(result, 1))
    }
}