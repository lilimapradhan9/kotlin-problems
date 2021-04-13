package dayFolders.day23

import java.util.*

fun evalRPN(tokens: Array<String>): Int {
    if (tokens.isEmpty()) return 0

    val stack = Stack<Int>()

    val operators =
        hashMapOf("+" to { a: Int, b: Int -> a + b },
            "-" to { a: Int, b: Int -> a - b },
            "*" to { a: Int, b: Int -> a * b },
            "/" to { a: Int, b: Int -> a / b })
    for (token in tokens) {
        when (token) {
            "+", "-", "*", "/" -> {
                val op1 = stack.pop()
                val op2 = stack.pop()
                stack.push(operators[token]!!(op2, op1))
            }
            else -> stack.push(token.toInt())
        }
    }
    return stack.pop()
}