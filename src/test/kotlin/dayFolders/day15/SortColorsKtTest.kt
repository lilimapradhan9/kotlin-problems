package dayFolders.day15

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SortColorsKtTest {
    @Test
    fun `should sort 2,0,2,1,1,0`() {
        val nums = intArrayOf(2, 0, 2, 1, 1, 0)

        sortColors(nums)

        Assertions.assertEquals(listOf(0, 0, 1, 1, 2, 2), nums.toList())
    }

    @Test
    fun `should sort 2,0,1`() {
        val nums = intArrayOf(2, 0, 1)

        sortColors(nums)

        Assertions.assertEquals(listOf(0, 1, 2), nums.toList())
    }

    @Test
    fun `should sort 0`() {
        val nums = intArrayOf(0)

        sortColors(nums)

        Assertions.assertEquals(listOf(0), nums.toList())
    }

    @Test
    fun `should sort 1`() {
        val nums = intArrayOf(1)

        sortColors(nums)

        Assertions.assertEquals(listOf(1), nums.toList())
    }
}