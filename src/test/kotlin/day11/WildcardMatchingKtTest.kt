package day11

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class WildcardMatchingKtTest {
    @Test
    fun `should match string aa and pattern a`() {
        val match = isMatch("aa", "a")

        Assertions.assertFalse(match)
    }

    @Test
    fun `should match string aa and pattern *`() {
        val match = isMatch("aa", "*")

        Assertions.assertTrue(match)
    }

    @Test
    fun `should match string cb and pattern ?a`() {
        val match = isMatch("cb", "?a")

        Assertions.assertFalse(match)
    }

    @Test
    fun `should match string adceb and pattern *a*b`() {
        val match = isMatch("adceb", "*a*b")

        Assertions.assertTrue(match)
    }

    @Test
    fun `should match string acdcb and pattern a*c?b`() {
        val match = isMatch("acdcb", "a*c?b")

        Assertions.assertFalse(match)
    }
}