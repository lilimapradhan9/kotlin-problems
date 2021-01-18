package day22

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class LongestConsecutiveSequenceKtTest {
    @Test
    fun `should return the length of the longest consecutive elements sequence`() {
        val longestConsecutiveLength = longestConsecutive(intArrayOf(100, 4, 200, 1, 3, 2))

        Assertions.assertEquals(4, longestConsecutiveLength)
    }

    @Test
    fun `should return the length of the longest consecutive elements sequence for 0,3,7,2,5,8,4,6,0,1`() {
        val longestConsecutiveLength = longestConsecutive(intArrayOf(0, 3, 7, 2, 5, 8, 4, 6, 0, 1))

        Assertions.assertEquals(9, longestConsecutiveLength)
    }
}