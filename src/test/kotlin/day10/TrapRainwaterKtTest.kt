package day10

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TrapRainwaterKtTest {
    @Test
    fun `return trap units for 0,1,0,2,1,0,1,3,2,1,2,1`() {
        val trap = trap(intArrayOf(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1))

        Assertions.assertEquals(6, trap)
    }

    @Test
    fun `return trap units for 4,2,0,3,2,5`() {
        val trap = trap(intArrayOf(4, 2, 0, 3, 2, 5))

        Assertions.assertEquals(9, trap)
    }
}