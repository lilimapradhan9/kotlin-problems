package dayFolders.day16

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class WordSearchKtTest {
    @Test
    fun `should return true for ABCCED`() {
        val exist = exist(
            arrayOf(
                charArrayOf('A', 'B', 'C', 'E'),
                charArrayOf('S', 'F', 'C', 'S'),
                charArrayOf('A', 'D', 'E', 'E')
            ),
            "ABCCED"
        )

        Assertions.assertEquals(true, exist)
    }

    @Test
    fun `should return true for SEE`() {
        val exist = exist(
            arrayOf(
                charArrayOf('A', 'B', 'C', 'E'),
                charArrayOf('S', 'F', 'C', 'S'),
                charArrayOf('A', 'D', 'E', 'E')
            ),
            "SEE"
        )

        Assertions.assertEquals(true, exist)
    }

    @Test
    fun `should return FALSE for ABCB`() {
        val exist = exist(
            arrayOf(
                charArrayOf('A', 'B', 'C', 'E'),
                charArrayOf('S', 'F', 'C', 'S'),
                charArrayOf('A', 'D', 'E', 'E')
            ),
            "ABCB"
        )

        Assertions.assertEquals(false, exist)
    }
}