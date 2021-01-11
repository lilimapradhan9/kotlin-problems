package day15

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SetMatrixZerosKtTest {
    @Test
    fun `should set zeroes for 1,1,1, 1,0,1, 1,1,1`() {
        val matrix = arrayOf(intArrayOf(1, 1, 1), intArrayOf(1, 0, 1), intArrayOf(1, 1, 1))

        setZeroes(matrix)

        Assertions.assertEquals(listOf(1, 0, 1), matrix[0].toList())
        Assertions.assertEquals(listOf(0, 0, 0), matrix[1].toList())
        Assertions.assertEquals(listOf(1, 0, 1), matrix[2].toList())
    }

    @Test
    fun `should set zeroes for 0,1,2,0, 3,4,5,2, 1,3,1,5`() {
        val matrix = arrayOf(intArrayOf(0, 1, 2, 0), intArrayOf(3, 4, 5, 2), intArrayOf(1, 3, 1, 5))

        setZeroes(matrix)

        Assertions.assertEquals(listOf(0, 0, 0, 0), matrix[0].toList())
        Assertions.assertEquals(listOf(0, 4, 5, 0), matrix[1].toList())
        Assertions.assertEquals(listOf(0, 3, 1, 0), matrix[2].toList())
    }
}