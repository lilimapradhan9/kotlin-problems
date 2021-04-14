package april21.`14`

import dayFolders.models.ListNode

fun partition(head: ListNode?, x: Int): ListNode? {
    val smallerListStart = ListNode(-1)
    var smallerList : ListNode? = smallerListStart
    val largerListStart = ListNode(-1)
    var largerList : ListNode? = largerListStart
    var node = head

    while (node != null) {
        if (node.`val` < x) {
            smallerList?.next = node
            smallerList = smallerList?.next
        } else {
            largerList?.next = node
            largerList = largerList?.next
        }
        node = node.next
    }

    smallerList?.next = largerListStart.next
    largerList?.next = null

    return smallerListStart.next
}