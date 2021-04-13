package dayFolders.day26

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class LargestNumberKtTest {
    @Test
    fun `form the largest number for 10,2`() {
        val largestNumber = largestNumber(intArrayOf(10, 2))

        Assertions.assertEquals("210", largestNumber)
    }

    @Test
    fun `form the largest number for 3, 30, 34, 5, 9`() {
        val largestNumber = largestNumber(intArrayOf(3, 30, 34, 5, 9))

        Assertions.assertEquals("9534330", largestNumber)
    }

    @Test
    fun `form the largest number for 1`() {
        val largestNumber = largestNumber(intArrayOf(1))

        Assertions.assertEquals("1", largestNumber)
    }

    @Test
    fun `form the largest number for 10`() {
        val largestNumber = largestNumber(intArrayOf(10))

        Assertions.assertEquals("10", largestNumber)
    }
}