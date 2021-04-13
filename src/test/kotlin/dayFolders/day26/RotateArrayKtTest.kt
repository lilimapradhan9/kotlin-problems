package dayFolders.day26

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class RotateArrayKtTest {
    @Test
    fun `should rotate 1,2,3,4,5,6,7 for k=3`() {
        val nums = intArrayOf(1, 2, 3, 4, 5, 6, 7)

        rotate(nums, 3)

        Assertions.assertEquals(intArrayOf(5, 6, 7, 1, 2, 3, 4).toList(), nums.toList())
    }

    @Test
    fun `should rotate -1,-100,3,99 for k=2`() {
        val nums = intArrayOf(-1, -100, 3, 99)

        rotate(nums, 2)

        Assertions.assertEquals(intArrayOf(3, 99, -1, -100).toList(), nums.toList())
    }
}