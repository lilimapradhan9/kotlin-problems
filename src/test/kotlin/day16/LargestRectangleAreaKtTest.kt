package day16

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class LargestRectangleAreaKtTest {
    @Test
    fun `should return largest area for 2,1,5,6,2,3`() {
        val largestRectangleArea = largestRectangleArea(intArrayOf(2, 1, 5, 6, 2, 3, 1, 1, 1, 1, 1))

        Assertions.assertEquals(11, largestRectangleArea)
    }

    @Test
    fun `should return largest area for 2,4`() {
        val largestRectangleArea = largestRectangleArea(intArrayOf(2, 4))

        Assertions.assertEquals(4, largestRectangleArea)
    }
}