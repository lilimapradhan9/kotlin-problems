package dayFolders.day24

import java.util.*

class MinStack {
    var stack: Stack<Int> = Stack()
    var min: Stack<Int> = Stack()
    fun push(x: Int) {
        stack.push(x)
        if (min.empty()) min.push(x) else if (min.peek() >= x) min.push(x)
    }

    fun pop() {
        val popped = stack.pop()
        if (!min.empty() && min.peek() == popped) {
            min.pop()
        }
    }

    fun top(): Int {
        return stack.peek()
    }

    fun getMin(): Int {
        return min.peek()
    }
}