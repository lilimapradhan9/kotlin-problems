package april21.`14`

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class IntToRoman {
    @Test
    fun `should convert 3`() {
        val result = intToRoman(3)

        Assertions.assertEquals("III", result)
    }

    @Test
    fun `should convert 4`() {
        val result = intToRoman(4)

        Assertions.assertEquals("IV", result)
    }

    @Test
    fun `should convert 9`() {
        val result = intToRoman(9)

        Assertions.assertEquals("IX", result)
    }

    @Test
    fun `should convert 58`() {
        val result = intToRoman(58)

        Assertions.assertEquals("LVIII", result)
    }

    @Test
    fun `should convert 1994`() {
        val result = intToRoman(1994)

        Assertions.assertEquals("MCMXCIV", result)
    }
}