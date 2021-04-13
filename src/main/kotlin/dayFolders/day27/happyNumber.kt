package dayFolders.day27

import java.util.*

fun isHappy(n: Int): Boolean {
    var number = n
    val inLoop: MutableSet<Int> = HashSet()
    var squareSum: Int
    var remain: Int
    while (inLoop.add(number)) {
        squareSum = 0
        while (number > 0) {
            remain = number % 10
            squareSum += remain * remain
            number /= 10
        }
        number = if (squareSum == 1) return true else squareSum
    }
    return false
}