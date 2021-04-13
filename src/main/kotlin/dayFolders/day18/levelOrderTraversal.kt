package dayFolders.day18

import dayFolders.models.TreeNode

@ExperimentalStdlibApi
fun levelOrder(root: TreeNode?): List<List<Int>> {
    val result = mutableListOf<MutableList<Int>>()
    if (root == null) return result

    val q = ArrayDeque<TreeNode>()
    q.add(root)

    while (!q.isEmpty()) {
        var size = q.size
        val list = ArrayList<Int>()

        while (size > 0) {
            val node = q.removeFirst()
            list.add(node.`val`)
            node.left?.let { q.add(it) }
            node.right?.let { q.add(it) }
            size--
        }
        result.add(list)
    }
    return result
}