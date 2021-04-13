package dayFolders.day14

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class UniquePathsKtTest {
    @Test
    fun `return number of unique paths for 3,7`() {
        val uniquePaths = uniquePaths(3, 7)

        Assertions.assertEquals(28, uniquePaths)
    }

    @Test
    fun `return number of unique paths for 3,2`() {
        val uniquePaths = uniquePaths(3, 2)

        Assertions.assertEquals(3, uniquePaths)
    }

    @Test
    fun `return number of unique paths for 7,3`() {
        val uniquePaths = uniquePaths(7, 3)

        Assertions.assertEquals(28, uniquePaths)
    }

    @Test
    fun `return number of unique paths for 3,3`() {
        val uniquePaths = uniquePaths(3, 3)

        Assertions.assertEquals(6, uniquePaths)
    }
}