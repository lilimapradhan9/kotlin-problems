package april21.`16`

import java.util.*

fun removeDuplicates(s: String, k: Int): String {
    val stack = Stack<Pair<Char, Int>>()

    for (c in s) {
        if (stack.isEmpty() || stack.peek().first != c) {
            stack.push(Pair(c, 1))
        } else {
            val v = stack.pop()
            if (v.second + 1 < k) {
                stack.push(Pair(v.first, v.second + 1))
            }
        }
    }

    return removeFromStack(stack).reversed()
}

private fun removeFromStack(stack: Stack<Pair<Char, Int>>): String {
    var res = ""
    while (!stack.isEmpty()) {
        val v = stack.pop()
        for (i in 0 until v.second) {
            res += (v.first)
        }
    }
    return res
}