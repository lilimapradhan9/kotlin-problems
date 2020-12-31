package day7

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StrStrKtTest {
    @Test
    fun `should return position of ll in hello`() {
        val position = strStr("hello", "ll")

        Assertions.assertEquals(2, position)
    }

    @Test
    fun `should return position of bba in aaaaa`() {
        val position = strStr("aaaaa", "bba")

        Assertions.assertEquals(-1, position)
    }

    @Test
    fun `should return position of empty needle in empty string`() {
        val position = strStr("", "")

        Assertions.assertEquals(0, position)
    }

    @Test
    fun `should return position of a in a`() {
        val position = strStr("a", "a")

        Assertions.assertEquals(0, position)
    }
}