package april21.a18

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


class FourSumKtTest {
    @Test
    fun `should return list that results to sum 0 `() {
        val result = fourSum(intArrayOf(1, 0, -1, 0, -2, 2), 0)

        Assertions.assertEquals(listOf(-2, -1, 1, 2), result[0])
        Assertions.assertEquals(listOf(-2, 0, 0, 2), result[1])
        Assertions.assertEquals(listOf(-1, 0, 0, 1), result[2])
    }

    @Test
    fun `should return list that results to sum 8 `() {
        val result = fourSum(intArrayOf(2, 2, 2, 2, 2), 8)

        Assertions.assertEquals(listOf(2, 2, 2, 2), result[0])
    }
}