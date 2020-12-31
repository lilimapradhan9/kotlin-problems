package util

import models.ListNode

fun nthNodeValue(output: ListNode?, n: Int): Int? {
    var node = output
    for (i in 0 until n) node = node?.next
    return node?.`val`
}