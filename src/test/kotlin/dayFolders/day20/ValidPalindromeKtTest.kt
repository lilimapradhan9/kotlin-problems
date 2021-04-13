package dayFolders.day20

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ValidPalindromeKtTest {
    @Test
    fun `should return true for a palindrome string`() {
        val palindrome = isPalindrome("A man, a plan, a canal: Panama")

        Assertions.assertEquals(true, palindrome)
    }

    @Test
    fun `should return false for a non palindrome string`() {
        val palindrome = isPalindrome("race a car")

        Assertions.assertEquals(false, palindrome)
    }

    @Test
    fun `should return false for 0P`() {
        val palindrome = isPalindrome("0P")

        Assertions.assertEquals(false, palindrome)
    }
}