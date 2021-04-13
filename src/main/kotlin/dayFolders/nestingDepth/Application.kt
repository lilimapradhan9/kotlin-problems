package dayFolders.nestingDepth

import java.lang.System.`in`
import java.util.*

fun main() {
    val scanner = Scanner(`in`)
    print("Enter number of inputs : ")
    val numberOfInputs = scanner.nextInt()

    for (index in 0 until numberOfInputs) {
        print("Input : ")
        val numberSequence = scanner.next()
        val result = nestNumberWithParentheses(numberSequence)
        print("Output : $result")
        println()
    }
}

