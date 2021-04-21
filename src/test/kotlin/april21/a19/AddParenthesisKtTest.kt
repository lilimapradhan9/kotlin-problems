package april21.a19

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AddParenthesisKtTest {
    @Test
    fun `return number of answers code for 2-1-1`() {
        val answers = diffWaysToCompute("2-1-1")

        assertEquals(listOf(2, 0), answers)
    }

    @Test
    fun `return number of answers code for 2*3-4*5`() {
        val answers = diffWaysToCompute("2*3-4*5")

        assertEquals(listOf(-34, -10, -14, -10, 10), answers)
    }
}