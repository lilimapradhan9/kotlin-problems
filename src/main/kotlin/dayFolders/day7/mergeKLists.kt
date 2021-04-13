package dayFolders.day7

import dayFolders.models.ListNode
import java.util.*

fun mergeKLists(lists: Array<ListNode?>): ListNode? {
    val listWithAllElements = PriorityQueue<Int>()
    var dummyNode = ListNode(0)
    val resultHead = dummyNode

    for (list in lists) {
        var head = list
        while (head != null) {
            listWithAllElements.offer(head.`val`)
            head = head.next
        }
    }

    while (listWithAllElements.isNotEmpty()) {
        dummyNode.next = ListNode(listWithAllElements.poll())
        dummyNode = dummyNode.next!!
    }
    return resultHead.next
}