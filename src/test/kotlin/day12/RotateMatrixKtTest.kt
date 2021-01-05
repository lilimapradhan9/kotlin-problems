package day12

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class RotateMatrixKtTest {
    @Test
    fun `should rotate the matrix`() {
        val result = rotate(arrayOf(intArrayOf(1)))

        Assertions.assertEquals(1, result[0][0])
    }

    @Test
    fun `should rotate the 2d matrix`() {
        val result = rotate(arrayOf(intArrayOf(1, 2), intArrayOf(3, 4)))

        Assertions.assertEquals(3, result[0][0])
        Assertions.assertEquals(1, result[0][1])
        Assertions.assertEquals(4, result[1][0])
        Assertions.assertEquals(2, result[1][1])
    }

    @Test
    fun `should rotate the 3d matrix`() {
        val result =
            rotate(
                arrayOf(
                    intArrayOf(5, 1, 9, 11),
                    intArrayOf(2, 4, 8, 10),
                    intArrayOf(13, 3, 6, 7),
                    intArrayOf(15, 14, 12, 16)
                )
            )

        Assertions.assertEquals(arrayOf(15, 13, 2, 5).toList(), result[0].toList())
        Assertions.assertEquals(arrayOf(14, 3, 4, 1).toList(), result[1].toList())
        Assertions.assertEquals(arrayOf(12, 6, 8, 9).toList(), result[2].toList())
        Assertions.assertEquals(arrayOf(16, 7, 10, 11).toList(), result[3].toList())
    }
}