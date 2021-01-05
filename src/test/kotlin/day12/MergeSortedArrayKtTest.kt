package day12

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MergeSortedArrayKtTest {
    @Test
    fun `should merge 1,2,3,0,0,0 and 2,5,6`() {
        val result = merge(intArrayOf(1, 2, 3, 0, 0, 0), 3, intArrayOf(2, 5, 6), 3)

        Assertions.assertEquals(listOf(1, 2, 2, 3, 5, 6), result.toList())
    }

    @Test
    fun `should merge 1 and empty array`() {
        val result = merge(intArrayOf(1), 1, intArrayOf(), 0)

        Assertions.assertEquals(listOf(1), result.toList())
    }
}