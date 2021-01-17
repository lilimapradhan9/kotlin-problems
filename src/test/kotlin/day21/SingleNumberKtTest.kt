package day21

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SingleNumberKtTest {
    @Test
    fun `should return the single number for 2,2,1`() {
        val singleNumber = singleNumber(intArrayOf(2, 2, 1))

        Assertions.assertEquals(1, singleNumber)
    }

    @Test
    fun `should return the single number for 4,1,2,1,2`() {
        val singleNumber = singleNumber(intArrayOf(4, 1, 2, 1, 2))

        Assertions.assertEquals(4, singleNumber)
    }

    @Test
    fun `should return the single number for 1`() {
        val singleNumber = singleNumber(intArrayOf(1))

        Assertions.assertEquals(1, singleNumber)
    }
}