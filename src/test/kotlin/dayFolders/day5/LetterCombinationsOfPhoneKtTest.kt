package dayFolders.day5

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class LetterCombinationsOfPhoneKtTest {
    @Test
    fun `return combinations for 23`() {
        val letterCombinations = letterCombinations("23")

        Assertions.assertEquals(listOf("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"), letterCombinations)
    }

    @Test
    fun `return combinations for empty string`() {
        val letterCombinations = letterCombinations("")

        Assertions.assertEquals(0, letterCombinations.size)
    }

    @Test
    fun `return combinations for single digit`() {
        val letterCombinations = letterCombinations("2")

        Assertions.assertEquals(listOf("a", "b", "c"), letterCombinations)
    }
}