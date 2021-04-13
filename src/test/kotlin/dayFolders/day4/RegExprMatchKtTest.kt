package dayFolders.day4

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class RegExprMatchKtTest {
    @Test
    fun `regular expression match for input ss and pattern a`() {
        val match = isMatch("ss","a")

        Assertions.assertFalse(match)
    }

    @Test
    fun `regular expression match for input aa and pattern a*`() {
        val match = isMatch("aa","a*")

        Assertions.assertTrue(match)
    }

    @Test
    fun `regular expression match for input ab and pattern DOT*`() {
        val match = isMatch("ab",".*")

        Assertions.assertTrue(match)
    }

    @Test
    fun `regular expression match for input mississippi and pattern mis*is*p*DOT`() {
        val match = isMatch("mississippi","mis*is*p*.")

        Assertions.assertFalse(match)
    }

    @Test
    fun `regular expression match for input ab and pattern DOT*c`() {
        val match = isMatch("ab",".*c")

        Assertions.assertFalse(match)
    }

    @Test
    fun `regular expression match for input aab and pattern c*a*b`() {
        val match = isMatch("aab","c*a*b")

        Assertions.assertTrue(match)
    }
}