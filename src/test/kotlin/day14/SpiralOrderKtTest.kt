package day14

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SpiralOrderKtTest {
    @Test
    fun `should return spiral for 1,2,3, 4,5,6, 7,8,9`() {
        val spiral = spiralOrder(
            arrayOf(
                intArrayOf(1, 2, 3),
                intArrayOf(4, 5, 6),
                intArrayOf(7, 8, 9)
            )
        )

        Assertions.assertEquals(listOf(1, 2, 3, 6, 9, 8, 7, 4, 5), spiral)
    }

    @Test
    fun `should return spiral for 1,2,3,4, 5,6,7,8, 9,10,11,12`() {
        val spiral = spiralOrder(
            arrayOf(
                intArrayOf(1, 2, 3, 4),
                intArrayOf(5, 6, 7, 8),
                intArrayOf(9, 10, 11, 12)
            )
        )

        Assertions.assertEquals(listOf(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7), spiral)
    }

    @Test
    fun `should return spiral for 1,2, 3,4`() {
        val spiral = spiralOrder(
            arrayOf(
                intArrayOf(1, 2),
                intArrayOf(3, 4)
            )
        )

        Assertions.assertEquals(listOf(1, 2, 4, 3), spiral)
    }
}