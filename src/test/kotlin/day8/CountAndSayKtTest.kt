package day8

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CountAndSayKtTest {
    @Test
    fun `return string for 1`() {
        val result = countAndSay(1)

        Assertions.assertEquals("1", result)
    }

    @Test
    fun `return string for 2`() {
        val result = countAndSay(2)

        Assertions.assertEquals("11", result)
    }

    @Test
    fun `return string for 3`() {
        val result = countAndSay(3)

        Assertions.assertEquals("21", result)
    }

    @Test
    fun `return string for 4`() {
        val result = countAndSay(4)

        Assertions.assertEquals("1211", result)
    }

    @Test
    fun `return string for 5`() {
        val result = countAndSay(5)

        Assertions.assertEquals("111221", result)
    }
}