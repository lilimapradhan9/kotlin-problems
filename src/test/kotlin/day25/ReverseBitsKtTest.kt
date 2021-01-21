package day25

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ReverseBitsKtTest {
    @Test
    fun `should revert bits for 00000010100101000001111010011100`() {
        val reversedBits = reverseBits(-3)

        Assertions.assertEquals(-1073741825, reversedBits)
    }

    @Test
    fun `should revert bits for 11111101011010111110000101100100`() {
        val reversedBits = reverseBits(-43261596)

        Assertions.assertEquals(646436543, reversedBits)
    }
}