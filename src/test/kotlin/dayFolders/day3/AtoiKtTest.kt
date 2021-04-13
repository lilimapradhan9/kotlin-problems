package dayFolders.day3

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class AtoiKtTest {
    @Test
    fun `should return the atoi for numeric input`() {
        val atoi = atoi("42")

        Assertions.assertEquals(42, atoi)
    }

    @Test
    fun `should return the atoi for alpha numeric input with alphabets after number`() {
        val atoi = atoi(" 4193 with words")

        Assertions.assertEquals(4193, atoi)
    }

    @Test
    fun `should return the atoi for alpha numeric input with alphabets before number`() {
        val atoi = atoi("words and 987")

        Assertions.assertEquals(0, atoi)
    }

    @Test
    fun `should return the atoi for negative number`() {
        val atoi = atoi(" -42")

        Assertions.assertEquals(-42, atoi)
    }

    @Test
    fun `should return the atoi for empty string`() {
        val atoi = atoi("")

        Assertions.assertEquals(0, atoi)
    }

    @Test
    fun `should return the atoi for number out of range`() {
        val atoi = atoi("-91283472332")

        Assertions.assertEquals(-2147483648, atoi)
    }

    @Test
    fun `should return the atoi for number with decimal`() {
        val atoi = atoi("3.42345")

        Assertions.assertEquals(3, atoi)
    }

    @Test
    fun `should return the atoi for number with -+`() {
        val atoi = atoi("-+12")

        Assertions.assertEquals(0, atoi)
    }

    @Test
    fun `should return the atoi for number with +1`() {
        val atoi = atoi("+1")

        Assertions.assertEquals(1, atoi)
    }

    @Test
    fun `should return the atoi for number with -5-`() {
        val atoi = atoi("-5-")

        Assertions.assertEquals(-5, atoi)
    }
}


