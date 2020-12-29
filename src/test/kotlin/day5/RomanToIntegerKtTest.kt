package day5

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class RomanToIntegerKtTest {
    @Test
    fun `should return value for III`() {
        val number = romanToInt("III")

        Assertions.assertEquals(3, number)
    }

    @Test
    fun `should return value for IV`() {
        val number = romanToInt("IV")

        Assertions.assertEquals(4, number)
    }

    @Test
    fun `should return value for IX`() {
        val number = romanToInt("IX")

        Assertions.assertEquals(9, number)
    }

    @Test
    fun `should return value for LVIII`() {
        val number = romanToInt("LVIII")

        Assertions.assertEquals(58, number)
    }

    @Test
    fun `should return value for MCMXCIV`() {
        val number = romanToInt("MCMXCIV")

        Assertions.assertEquals(1994, number)
    }
}