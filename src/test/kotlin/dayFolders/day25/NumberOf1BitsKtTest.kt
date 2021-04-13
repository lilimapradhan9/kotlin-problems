package dayFolders.day25

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class NumberOf1BitsKtTest {
    @Test
    fun `return number of 31 for 11111111111111111111111111111101`() {
        val hammingWeight = hammingWeight(-3)

        Assertions.assertEquals(31, hammingWeight)
    }

    @Test
    fun `return number of 1 for 00000000000000000000000010000000`() {
        val hammingWeight = hammingWeight(128)

        Assertions.assertEquals(1, hammingWeight)
    }

    @Test
    fun `return number of 3 for 00000000000000000000000000001011`() {
        val hammingWeight = hammingWeight(11)

        Assertions.assertEquals(3, hammingWeight)
    }
}