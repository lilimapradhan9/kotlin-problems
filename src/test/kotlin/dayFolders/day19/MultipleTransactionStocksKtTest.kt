package dayFolders.day19

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MultipleTransactionStocksKtTest {
    @Test
    fun `should return max profit for 7,1,5,3,6,4`() {
        val maxProfit = maxProfitForMultipleTransactions(intArrayOf(7, 1, 5, 3, 6, 4))

        Assertions.assertEquals(7, maxProfit)
    }

    @Test
    fun `should return max profit for 1,2,3,4,5`() {
        val maxProfit = maxProfitForMultipleTransactions(intArrayOf(1, 2, 3, 4, 5))

        Assertions.assertEquals(4, maxProfit)
    }

    @Test
    fun `should return max profit for 7,6,4,3,1`() {
        val maxProfit = maxProfitForMultipleTransactions(intArrayOf(7, 6, 4, 3, 1))

        Assertions.assertEquals(0, maxProfit)
    }

    @Test
    fun `should return max profit for 1,2`() {
        val maxProfit = maxProfitForMultipleTransactions(intArrayOf(1, 2))

        Assertions.assertEquals(1, maxProfit)
    }

    @Test
    fun `should return max profit for 2,4,1`() {
        val maxProfit = maxProfitForMultipleTransactions(intArrayOf(2, 4, 1))

        Assertions.assertEquals(2, maxProfit)
    }
}