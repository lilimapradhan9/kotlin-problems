package april21.a18

import dayFolders.models.ListNode


fun swapPairs(head: ListNode?): ListNode? {
    if (head?.next == null) return head
    var current = head
    val newHead = head.next
    while (current?.next != null) {
        val tmp: ListNode = current
        current = current.next
        tmp.next = current!!.next
        current.next = tmp
        current = tmp.next
        if (current?.next != null) tmp.next = current?.next
    }
    return newHead
}