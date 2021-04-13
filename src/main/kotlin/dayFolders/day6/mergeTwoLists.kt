package dayFolders.day6

import dayFolders.models.ListNode

fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
    var list1 = l1
    var list2 = l2
    val dummyNode = ListNode(-200)
    var result: ListNode? = dummyNode

    while (list1 != null && list2 != null) {
        if (list1.`val` < list2.`val`) {
            result?.next = list1
            result = result?.next
            list1 = list1.next
        } else {
            result?.next = list2
            result = result?.next
            list2 = list2.next
        }
    }

    while (list1 != null) {
        result?.next = list1
        result = result?.next
        list1 = list1.next
    }

    while (list2 != null) {
        result?.next = list2
        result = result?.next
        list2 = list2.next
    }

    return dummyNode.next
}