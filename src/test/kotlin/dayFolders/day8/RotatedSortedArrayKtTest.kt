package dayFolders.day8

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class RotatedSortedArrayKtTest {
    @Test
    fun `should return position of 0 in 4,5,6,7,0,1,2`() {
        val position = search(intArrayOf(4, 5, 6, 7, 0, 1, 2), 0)

        Assertions.assertEquals(4, position)
    }

    @Test
    fun `should return position of 3 in 4,5,6,7,0,1,2`() {
        val position = search(intArrayOf(4, 5, 6, 7, 0, 1, 2), 3)

        Assertions.assertEquals(-1, position)
    }

    @Test
    fun `should return position of 0 in 1`() {
        val position = search(intArrayOf(1), 0)

        Assertions.assertEquals(-1, position)
    }
}