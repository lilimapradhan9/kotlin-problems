package day24

import models.ListNode


fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {
    if (headA == null || headB == null) return null

    var firstList = headA
    var secondList = headB

    while (firstList != secondList) {
        firstList = if (firstList == null) headB else firstList.next
        secondList = if (secondList == null) headA else secondList.next
    }

    return firstList
}