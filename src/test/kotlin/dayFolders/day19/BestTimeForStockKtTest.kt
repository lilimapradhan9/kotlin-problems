package dayFolders.day19

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class BestTimeForStockKtTest {
    @Test
    fun `should return max profit for 7,1,5,3,6,4`() {
        val maxProfit = maxProfit(intArrayOf(7, 1, 5, 3, 6, 4))

        Assertions.assertEquals(5, maxProfit)
    }

    @Test
    fun `should return max profit for 7,6,4,3,1`() {
        val maxProfit = maxProfit(intArrayOf(7, 6, 4, 3, 1))

        Assertions.assertEquals(0, maxProfit)
    }

    @Test
    fun `should return max profit for 1,2`() {
        val maxProfit = maxProfit(intArrayOf(1, 2))

        Assertions.assertEquals(1, maxProfit)
    }

    @Test
    fun `should return max profit for 2,4,1`() {
        val maxProfit = maxProfit(intArrayOf(2, 4, 1))

        Assertions.assertEquals(2, maxProfit)
    }
}