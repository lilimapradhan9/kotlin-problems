package day2

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class LongestPalindromeSubstringKtTest {
    @Test
    fun `should return the longest palindrome substring for bccd`() {
        val longestPalindrome = longestPalindrome("bccd")

        Assertions.assertEquals("cc", longestPalindrome)
    }

    @Test
    fun `should return the longest palindrome substring for empty string`() {
        val longestPalindrome = longestPalindrome("")

        Assertions.assertEquals("", longestPalindrome)
    }

    @Test
    fun `should return the longest palindrome substring for babad`() {
        val longestPalindrome = longestPalindrome("babad")

        Assertions.assertEquals("bab", longestPalindrome)
    }

    @Test
    fun `should return the longest palindrome substring for a`() {
        val longestPalindrome = longestPalindrome("a")

        Assertions.assertEquals("a", longestPalindrome)
    }
}