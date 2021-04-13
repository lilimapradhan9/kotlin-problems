package dayFolders.day10

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FirstMissingPositiveKtTest {
    @Test
    fun `should return the smallest missing number for 1,2,0`() {
        val number = firstMissingPositive(intArrayOf(1, 2, 0))

        Assertions.assertEquals(3, number)
    }

    @Test
    fun `should return the smallest missing number for 3,4,-1,1`() {
        val number = firstMissingPositive(intArrayOf(3, 4, -1, 1))

        Assertions.assertEquals(2, number)
    }

    @Test
    fun `should return the smallest missing number for 7,8,9,11,12`() {
        val number = firstMissingPositive(intArrayOf(7, 8, 9, 11, 12))

        Assertions.assertEquals(1, number)
    }
}