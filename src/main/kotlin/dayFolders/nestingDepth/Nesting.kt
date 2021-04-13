package dayFolders.nestingDepth

import java.util.*

fun nestNumberWithParentheses(numberSequence: String): String {
    val stack = Stack<Char>()

    for (index in numberSequence.indices) {
        val number = numberSequence[index]
        pushStartingBrace(number, stack)
        stack.push(number)
        pushEndingBrace(number, stack)
    }

    return formResult(stack)
}

private fun pushStartingBrace(number: Char, stack: Stack<Char>) {
    for (i in 0 until Character.getNumericValue(number)) {
        if (stack.isNotEmpty() && stack.peek() == ')') {
            stack.pop()
        } else stack.push('(')
    }
}

private fun pushEndingBrace(number: Char, stack: Stack<Char>) {
    for (i in 0 until Character.getNumericValue(number)) {
        stack.push(')')
    }
}

private fun formResult(stack: Stack<Char>): String {
    var result = ""
    while (stack.isNotEmpty()) {
        result += stack.pop()
    }
    return result.reversed()
}
