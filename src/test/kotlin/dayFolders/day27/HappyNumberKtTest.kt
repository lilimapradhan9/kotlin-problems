package dayFolders.day27

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class HappyNumberKtTest {
    @Test
    fun `should return true for 19`() {
        val happy = isHappy(19)

        Assertions.assertTrue(happy)
    }

    @Test
    fun `should return true for 2`() {
        val happy = isHappy(2)

        Assertions.assertFalse(happy)
    }
}