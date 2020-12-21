package day1

import findMedianSortedArrays
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MedianOfArraysKtTest {
    @Test
    fun `find median for arrays 1,2 and 3,4`() {
        val median = findMedianSortedArrays(intArrayOf(1, 2), intArrayOf(3, 4))

        Assertions.assertEquals(2.50000, median)
    }

    @Test
    fun `find median for arrays 0,0 and 0,0`() {
        val median = findMedianSortedArrays(intArrayOf(0, 0), intArrayOf(0, 0))

        Assertions.assertEquals(0.00000, median)
    }

    @Test
    fun `find median for empty array and array with 1`() {
        val median = findMedianSortedArrays(intArrayOf(), intArrayOf(1))

        Assertions.assertEquals(1.00000, median)
    }

    @Test
    fun `find median for array with 2 and empty array`() {
        val median = findMedianSortedArrays(intArrayOf(2), intArrayOf())

        Assertions.assertEquals(2.00000, median)
    }

    @Test
    fun `find median for arrays 1,3 and 2`() {
        val median = findMedianSortedArrays(intArrayOf(1, 3), intArrayOf(2))

        Assertions.assertEquals(2.00000, median)
    }
}