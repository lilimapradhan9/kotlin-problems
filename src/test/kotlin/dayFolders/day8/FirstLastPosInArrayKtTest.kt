package dayFolders.day8

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FirstLastPosInArrayKtTest {
    @Test
    fun `should give first and last position of 8 in 5,7,7,8,8,10`() {
        val positions = searchRange(intArrayOf(5, 7, 7, 8, 8, 10), 8)

        Assertions.assertEquals(3, positions[0])
        Assertions.assertEquals(4, positions[1])
    }

    @Test
    fun `should give first and last position of 6 in 5,7,7,8,8,10`() {
        val positions = searchRange(intArrayOf(5, 7, 7, 8, 8, 10), 6)

        Assertions.assertEquals(-1, positions[0])
        Assertions.assertEquals(-1, positions[1])
    }

    @Test
    fun `should give first and last position of 0 in empty array`() {
        val positions = searchRange(intArrayOf(), 0)

        Assertions.assertEquals(-1, positions[0])
        Assertions.assertEquals(-1, positions[1])
    }

    @Test
    fun `should give first and last position of 1 in 1`() {
        val positions = searchRange(intArrayOf(1), 1)

        Assertions.assertEquals(0, positions[0])
        Assertions.assertEquals(0, positions[1])
    }

    @Test
    fun `should give first and last position of 2 in 2,2`() {
        val positions = searchRange(intArrayOf(2, 2), 2)

        Assertions.assertEquals(0, positions[0])
        Assertions.assertEquals(1, positions[1])
    }
}