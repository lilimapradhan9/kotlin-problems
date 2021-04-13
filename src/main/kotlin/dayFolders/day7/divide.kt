package dayFolders.day7

fun divide(dividend: Int, divisor: Int): Int {
        var quotient = 0

    if (dividend == Int.MIN_VALUE) {
        if (divisor == -1) return Int.MAX_VALUE
            else if (divisor == 1) return Int.MIN_VALUE
        }

        var unSignedNumber = Math.abs(dividend)
        val unsignedDivisor = Math.abs(divisor)
        while (unSignedNumber - unsignedDivisor >= 0) {
            unSignedNumber -= unsignedDivisor
            quotient += 1
        }
        return when {
            dividend < 0 && divisor < 0 -> quotient
            dividend < 0 && divisor > 0 -> -quotient
            dividend > 0 && divisor < 0 -> -quotient
            else -> quotient
        }
}