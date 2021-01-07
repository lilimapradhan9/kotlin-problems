package day14

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class JumpGameKtTest {
    @Test
    fun `should return true for 2,3,1,1,4`() {
        val canJump = canJump(intArrayOf(2, 3, 1, 1, 4))

        Assertions.assertEquals(true, canJump)
    }

    @Test
    fun `should return false for 3,2,1,0,4`() {
        val canJump = canJump(intArrayOf(3, 2, 1, 0, 4))

        Assertions.assertEquals(false, canJump)
    }
}