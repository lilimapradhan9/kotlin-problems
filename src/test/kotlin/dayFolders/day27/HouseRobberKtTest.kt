package dayFolders.day27

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class HouseRobberKtTest {
    @Test
    fun `should return the result for 1,2,3,1`() {
        val maxRob = rob(intArrayOf(1, 2, 3, 1))

        Assertions.assertEquals(4, maxRob)
    }

    @Test
    fun `should return the result for 2,7,9,3,1`() {
        val maxRob = rob(intArrayOf(2, 7, 9, 3, 1))

        Assertions.assertEquals(12, maxRob)
    }
}