package day22

import java.util.*

class Node(var `val`: Int) {
    var next: Node? = null
    var random: Node? = null
}

fun copyRandomList(node: Node?): Node? {
    if (node == null) return null

    val map = HashMap<Node, Node>()
    var nodeIter = node
    val copyNode = Node(-1)
    var nodeIterCopy = copyNode

    while (nodeIter != null) {
        val random = nodeIter.random
        val copied = map.getOrPut(nodeIter, { Node(nodeIter!!.`val`) })

        if (random != null && !map.contains(random)) {
            copied.random = Node(random.`val`)
            map[random] = copied.random!!
        }

        nodeIterCopy.next = copied
        nodeIterCopy = nodeIterCopy.next!!
        nodeIter = nodeIter.next
    }

    return copyNode.next
}