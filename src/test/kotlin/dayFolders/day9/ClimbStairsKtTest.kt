package dayFolders.day9

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ClimbStairsKtTest {
    @Test
    fun `should return the output for 1`() {
        val stairs = climbStairs(1)

        Assertions.assertEquals(1, stairs)
    }

    @Test
    fun `should return the output for 2`() {
        val stairs = climbStairs(2)

        Assertions.assertEquals(2, stairs)
    }

    @Test
    fun `should return the output for 3`() {
        val stairs = climbStairs(3)

        Assertions.assertEquals(3, stairs)
    }
}