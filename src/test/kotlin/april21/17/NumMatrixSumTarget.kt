package april21.`17`

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class NumSubmatrixSumTargetTest {
    @Test
    fun `should return the number of submatrices for sum 0 and matrix 2*2 `() {
        val result = numSubmatrixSumTarget(arrayOf(intArrayOf(1, -1), intArrayOf(-1, 1)), 0)

        Assertions.assertEquals(5, result)
    }

    @Test
    fun `should return the number of submatrices for sum 0 and 3*3 matrix`() {
        val result = numSubmatrixSumTarget(arrayOf(intArrayOf(0, 1, 0), intArrayOf(1, 1, 1), intArrayOf(0, 1, 0)), 0)

        Assertions.assertEquals(4, result)
    }
}