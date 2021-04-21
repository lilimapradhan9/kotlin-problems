package april21

import kotlin.math.pow

fun Int.pow(exp: Int) = toDouble().pow(exp.toDouble()).toInt()

fun grayCode(n: Int): List<Int> {
    return (0 until 2.pow(n)).map { it xor (it shr 1) }
}