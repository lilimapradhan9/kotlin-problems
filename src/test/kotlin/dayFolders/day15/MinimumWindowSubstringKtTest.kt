package dayFolders.day15

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MinimumWindowSubstringKtTest {
    @Test
    fun `should return the minimum window for string ADOBECODEBANC and characters ABC`() {
        val minWindow = minWindow("ADOBECODEBANC", "ABC")

        Assertions.assertEquals("BANC", minWindow)
    }

    @Test
    fun `should return the minimum window for string a and characters a`() {
        val minWindow = minWindow("a", "a")

        Assertions.assertEquals("a", minWindow)
    }
 }