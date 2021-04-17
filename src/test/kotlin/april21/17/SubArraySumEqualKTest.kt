package april21.`17`

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SubArraySumEqualKTest {
    @Test
    fun `should return 2 for 1,1,1 and target 2 `() {
        val result = subarraySum(intArrayOf(1, 1, 1), 2)

        Assertions.assertEquals(2, result)
    }

    @Test
    fun `should return 2 for 1,2,3 and target 3 `() {
        val result = subarraySum(intArrayOf(1, 2, 3), 3)

        Assertions.assertEquals(2, result)
    }
}