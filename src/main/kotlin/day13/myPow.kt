package day13

fun myPow(x: Double, n: Int): Double {
    var number = x
    var power: Long = Math.abs(n.toLong())
    var res = 1.0
    while (power != 0L) {
        if (power % 2 == 1L) {
            res *= number
        }
        power /= 2
        number *= number
    }
    return if (n > 0) res
    else 1 / res
}