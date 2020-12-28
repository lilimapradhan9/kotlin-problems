package day4

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ContainerWithMostWaterKtTest {
    @Test
    fun `should return maxArea for 1,1`() {
        val area = maxArea(intArrayOf(1, 1))

        assertEquals(1, area)
    }

    @Test
    fun `should return maxArea for 4,3,2,1,4`() {
        val area = maxArea(intArrayOf(4, 3, 2, 1, 4))

        assertEquals(16, area)
    }

    @Test
    fun `should return maxArea for 1,2,1`() {
        val area = maxArea(intArrayOf(1, 2, 1))

        assertEquals(2, area)
    }
}