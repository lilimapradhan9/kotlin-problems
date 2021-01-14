package day18

import models.TreeNode
import java.util.*
import kotlin.collections.ArrayList

fun zigzagLevelOrder(root: TreeNode?): List<List<Int>> {
    if (root == null) return emptyList()

    val ans = ArrayList<ArrayList<Int>>()
    val queue = LinkedList<TreeNode>()
    queue.offer(root)
    var level = 0

    while (queue.isNotEmpty()) {
        val nodeList = ArrayList<Int>()
        for (i in 0 until queue.size) {
            val node = queue.poll()
            if (level % 2 != 0) {
                nodeList.add(0, node.`val`)
            } else {
                nodeList.add(node.`val`)
            }

            node.left?.let { queue.offer(it) }
            node.right?.let { queue.offer(it) }
        }
        ans.add(nodeList)
        level++
    }
    return ans
}