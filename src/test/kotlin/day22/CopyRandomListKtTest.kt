package day22

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CopyRandomListKtTest {
    @Test
    fun `should return the copied list for 7,null, 13,0 , 11,4, 10,2 ,1,0`() {
        val node = Node(7)
        val secondNode = Node(13)
        node.next = secondNode
        node.random = null
        val thirdNode = Node(11)
        secondNode.next = thirdNode
        secondNode.random = node
        val fourthNode = Node(10)
        val fifthNode = Node(1)
        thirdNode.next = fourthNode
        thirdNode.random = fifthNode
        fourthNode.next = fifthNode
        fourthNode.random = thirdNode
        fifthNode.next = null
        fifthNode.random = node

        val copy = copyRandomList(node)

        Assertions.assertEquals(7, copy?.`val`)
        Assertions.assertEquals(13, copy?.next?.`val`)
        Assertions.assertEquals(11, copy?.next?.next?.`val`)
        Assertions.assertEquals(10, copy?.next?.next?.next?.`val`)
        Assertions.assertEquals(1, copy?.next?.next?.next?.next?.`val`)
    }

    @Test
    fun `should return the copied list for 1,1, 2,1`() {
        val node = Node(1)
        val secondNode = Node(2)
        node.next = secondNode
        node.random = secondNode
        secondNode.next = null
        secondNode.random = secondNode

        val copy = copyRandomList(node)

        Assertions.assertEquals(1, copy?.`val`)
        Assertions.assertEquals(2, copy?.next?.`val`)
    }

    @Test
    fun `should return the copied list for 3,null, 3,0, 3,null`() {
        val node = Node(3)
        val secondNode = Node(3)
        val thirdNode = Node(3)
        node.next = secondNode
        node.random = null
        secondNode.next = thirdNode
        secondNode.random = node
        thirdNode.next = null
        thirdNode.random = null

        val copy = copyRandomList(node)

        Assertions.assertEquals(3, copy?.`val`)
        Assertions.assertEquals(3, copy?.next?.`val`)
        Assertions.assertEquals(3, copy?.next?.next?.`val`)
    }

    @Test
    fun `should return the copied list for empty list`() {
        val node = null

        val copy = copyRandomList(node)

        Assertions.assertEquals(null, copy)
    }
}