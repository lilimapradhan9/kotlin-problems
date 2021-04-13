package dayFolders.day6

import dayFolders.models.ListNode

fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
    val dummy = ListNode(0)
    dummy.next = head

    var first: ListNode? = dummy
    var second:ListNode? = dummy
    var iterator = 0

    while (iterator <= n) {
        first = first?.next
        iterator++
    }

    while (first != null) {
        second = second?.next
        first = first.next
    }

    second?.next = second?.next?.next
    return dummy.next
}
