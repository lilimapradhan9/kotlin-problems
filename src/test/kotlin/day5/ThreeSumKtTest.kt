package day5

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ThreeSumKtTest {
    @Test
    fun `should return the triplets with sum 0 for -1,0,1,2,-1,-4`() {
        val threeSum = threeSum(intArrayOf(-1, 0, 1, 2, -1, -4))

        Assertions.assertEquals(listOf(listOf(-1, -1, 2), listOf(-1, 0, 1)), threeSum)
    }

    @Test
    fun `should return the triplets with sum 0 for empty array`() {
        val threeSum = threeSum(intArrayOf())

        Assertions.assertEquals(emptyList<Int>(), threeSum)
    }

    @Test
    fun `should return the triplets with sum 0 for array with single element`() {
        val threeSum = threeSum(intArrayOf(0))

        Assertions.assertEquals(emptyList<Int>(), threeSum)
    }

    @Test
    fun `should return the triplets with sum 0 for array with 0,0,0,0`() {
        val threeSum = threeSum(intArrayOf(0, 0, 0, 0))

        Assertions.assertEquals(listOf(listOf(0, 0, 0)), threeSum)
    }

    @Test
    fun `should return the triplets with sum 0 for array with -2,0,1,1,2`() {
        val threeSum = threeSum(intArrayOf(-2, 0, 1, 1, 2))

        Assertions.assertEquals(listOf(listOf(-2, 0, 2), listOf(-2, 1, 1)), threeSum)
    }
}