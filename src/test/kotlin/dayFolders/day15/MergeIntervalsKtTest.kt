package dayFolders.day15

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MergeIntervalsKtTest {
    @Test
    fun `should merge 1,3, 2,6, 8,10, 15,18`() {
        val mergedIntervals = merge(arrayOf(intArrayOf(1, 3), intArrayOf(2, 6), intArrayOf(8, 10), intArrayOf(15, 18)))

        Assertions.assertEquals(listOf(1, 6), mergedIntervals[0].toList())
        Assertions.assertEquals(listOf(8, 10), mergedIntervals[1].toList())
        Assertions.assertEquals(listOf(15, 18), mergedIntervals[2].toList())
    }

    @Test
    fun `should merge 1,3, 2,6, 5,10, 15,18`() {
        val mergedIntervals = merge(arrayOf(intArrayOf(1, 3), intArrayOf(2, 6), intArrayOf(5, 10), intArrayOf(15, 18)))

        Assertions.assertEquals(listOf(1, 10), mergedIntervals[0].toList())
        Assertions.assertEquals(listOf(15, 18), mergedIntervals[1].toList())
    }

    @Test
    fun `should merge 1,4, 4,5`() {
        val mergedIntervals = merge(arrayOf(intArrayOf(1, 4), intArrayOf(4, 5)))

        Assertions.assertEquals(listOf(1, 5), mergedIntervals[0].toList())
    }


    @Test
    fun `should merge 1,4, 0,4`() {
        val mergedIntervals = merge(arrayOf(intArrayOf(1, 4), intArrayOf(0, 4)))

        Assertions.assertEquals(listOf(0, 4), mergedIntervals[0].toList())
    }

    @Test
    fun `should merge 1,4, 2,3`() {
        val mergedIntervals = merge(arrayOf(intArrayOf(1, 4), intArrayOf(2, 3)))

        Assertions.assertEquals(listOf(1, 4), mergedIntervals[0].toList())
    }
}