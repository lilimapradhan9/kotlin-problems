package day9

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MaxSubArrayKtTest {
    @Test
    fun `should return the max sum of -2,1,-3,4,-1,2,1,-5,4`() {
        val maxSum = maxSubArray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4))

        Assertions.assertEquals(6, maxSum)
    }

    @Test
    fun `should return the max sum of 1`() {
        val maxSum = maxSubArray(intArrayOf(1))

        Assertions.assertEquals(1, maxSum)
    }

    @Test
    fun `should return the max sum of 0`() {
        val maxSum = maxSubArray(intArrayOf(0))

        Assertions.assertEquals(0, maxSum)
    }

    @Test
    fun `should return the max sum of -1`() {
        val maxSum = maxSubArray(intArrayOf(-1))

        Assertions.assertEquals(-1, maxSum)
    }

    @Test
    fun `should return the max sum of -2147483647`() {
        val maxSum = maxSubArray(intArrayOf(-2147483647))

        Assertions.assertEquals(-2147483647, maxSum)
    }
}