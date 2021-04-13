package dayFolders.day6

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class GenerateParanthesesKtTest {
    @Test
    fun `generate parenthesis for n=3`() {
        val patterns = generateParenthesis(3)

        val expected = listOf("((()))", "(()())", "(())()", "()(())", "()()()")
        assertTrue(patterns.size == expected.size &&
                expected.containsAll(patterns) && patterns.containsAll(expected));
    }

    @Test
    fun `generate parenthesis for n=1`() {
        val patterns = generateParenthesis(1)

        Assertions.assertLinesMatch(listOf("()"), patterns)
    }
}