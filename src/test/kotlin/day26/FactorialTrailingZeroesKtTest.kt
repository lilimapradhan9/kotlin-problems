package day26

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FactorialTrailingZeroesKtTest {
    @Test
    fun `return the number of trailing zeroes for 3`() {
        val trailingZeroes = trailingZeroes(3)

        Assertions.assertEquals(0, trailingZeroes)
    }

    @Test
    fun `return the number of trailing zeroes for 5`() {
        val trailingZeroes = trailingZeroes(5)

        Assertions.assertEquals(1, trailingZeroes)
    }

    @Test
    fun `return the number of trailing zeroes for 0`() {
        val trailingZeroes = trailingZeroes(0)

        Assertions.assertEquals(0, trailingZeroes)
    }
}