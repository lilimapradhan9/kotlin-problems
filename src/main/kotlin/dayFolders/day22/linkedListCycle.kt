package dayFolders.day22

import dayFolders.models.ListNode

fun hasCycle(head: ListNode?): Boolean {
    var fast = head
    var slow = head

    while (fast?.next != null) {
        fast = fast.next?.next
        slow = slow?.next
        if (fast == slow) return true
    }

    return false
}