package day17

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class DecodeWaysKtTest {
    @Test
    fun `should return the number of ways of decoding 12`() {
        val numDecodings = numDecodings("12")

        Assertions.assertEquals(2, numDecodings)
    }

    @Test
    fun `should return the number of ways of decoding 226`() {
        val numDecodings = numDecodings("226")

        Assertions.assertEquals(3, numDecodings)
    }

    @Test
    fun `should return the number of ways of decoding 0`() {
        val numDecodings = numDecodings("0")

        Assertions.assertEquals(0, numDecodings)
    }

    @Test
    fun `should return the number of ways of decoding 1`() {
        val numDecodings = numDecodings("1")

        Assertions.assertEquals(1, numDecodings)
    }
}