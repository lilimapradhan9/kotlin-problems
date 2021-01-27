package day26

fun trailingZeroes(n: Int): Int {
    return if(n < 5) 0
    else (n / 5) + trailingZeroes(n / 5)
}