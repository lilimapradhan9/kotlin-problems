package dayFolders.day23

import dayFolders.models.ListNode


fun sortList(head: ListNode?): ListNode? {
    if (head?.next == null) return head
    val mid = getMid(head)
    val left = sortList(head)
    val right = sortList(mid)
    return merge(left, right)
}

fun merge(list1: ListNode?, list2: ListNode?): ListNode? {
    var leftList = list1
    var rightList = list2
    val dummyHead = ListNode(-1)
    var tail: ListNode? = dummyHead
    while (leftList != null && rightList != null) {
        if (leftList.`val` < rightList.`val`) {
            tail!!.next = leftList
            leftList = leftList.next
            tail = tail.next
        } else {
            tail!!.next = rightList
            rightList = rightList.next
            tail = tail.next
        }
    }
    tail!!.next = leftList ?: rightList
    return dummyHead.next
}

fun getMid(head: ListNode?): ListNode? {
    var node = head
    var midPrev: ListNode? = null
    while (node?.next != null) {
        midPrev = if (midPrev == null) node else midPrev.next
        node = node.next!!.next
    }
    val mid = midPrev!!.next
    midPrev.next = null
    return mid
}
