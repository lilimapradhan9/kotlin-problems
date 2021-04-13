package dayFolders.day22

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class WordBreakKtTest {
    @Test
    fun `should return result for leetcode`() {
        val wordBreakPossible = wordBreak("leetcode", listOf("leet", "code"))

        Assertions.assertTrue(wordBreakPossible)
    }

    @Test
    fun `should return result for applepenapple`() {
        val wordBreakPossible = wordBreak("applepenapple", listOf("apple", "pen"))

        Assertions.assertTrue(wordBreakPossible)
    }

    @Test
    fun `should return result for catsandog`() {
        val wordBreakPossible = wordBreak("catsandog", listOf("cats", "dog", "sand", "and", "cat"))

        Assertions.assertFalse(wordBreakPossible)
    }

    @Test
    fun `should return result for aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab`() {
        val wordBreakPossible = wordBreakDp(
            "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab",
            listOf("a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa")
        )

        Assertions.assertFalse(wordBreakPossible)
    }
}