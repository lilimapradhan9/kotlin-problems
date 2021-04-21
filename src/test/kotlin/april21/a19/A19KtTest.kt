package april21

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class GrayCodeTest {
    @Test
    fun `return gray code for 2`() {
        val grayCode = grayCode(2)

        assertEquals(listOf(0, 1, 3, 2), grayCode)
    }

    @Test
    fun `return gray code for 1`() {
        val grayCode = grayCode(1)

        assertEquals(listOf(0, 1), grayCode)
    }
}