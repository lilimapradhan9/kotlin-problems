package dayFolders.day27

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class NumberOfIslandsKtTest {
    @Test
    fun `should return 1 as the number of islands`() {
        val numIslands = numIslands(
            arrayOf(
                charArrayOf('1', '1', '1', '1', '0'),
                charArrayOf('1', '1', '0', '1', '0'),
                charArrayOf('1', '1', '0', '0', '0'),
                charArrayOf('0', '0', '0', '0', '0')
            )
        )

        Assertions.assertEquals(1, numIslands)
    }

    @Test
    fun `should return 3 as the number of islands`() {
        val numIslands = numIslands(
            arrayOf(
                charArrayOf('1', '1', '0', '0', '0'),
                charArrayOf('1', '1', '0', '0', '0'),
                charArrayOf('0', '0', '1', '0', '0'),
                charArrayOf('0', '0', '0', '1', '1')
            )
        )

        Assertions.assertEquals(3, numIslands)
    }
}