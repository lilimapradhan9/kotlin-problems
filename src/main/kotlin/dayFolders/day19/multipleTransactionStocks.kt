package dayFolders.day19

fun maxProfitForMultipleTransactions(prices: IntArray): Int {
    var profit = 0
    var iter = 0
    while (iter < prices.size) {
        while (iter < prices.size - 1 && prices[iter + 1] <= prices[iter]) iter++
        val min = prices[iter++]
        while (iter < prices.size - 1 && prices[iter + 1] >= prices[iter]) iter++
        profit += if (iter < prices.size) prices[iter++] - min else 0
    }
    return profit
}