package day19

fun maxProfit(prices: IntArray): Int {
    var maxProfit = 0
    var minPrice = Int.MAX_VALUE

    for (p in prices) {
        minPrice = minOf(minPrice, p)
        maxProfit = maxOf(maxProfit, p - minPrice)
    }

    return maxProfit
}