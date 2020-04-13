package nestingDepth

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class NestingTest {
    @Test
    fun `should nest string 0000`() {
        val result = nestNumberWithParentheses("0000")

        assertThat(result).isEqualTo("0000")
    }

    @Test
    fun `should nest string 101`() {
        val result = nestNumberWithParentheses("101")

        assertThat(result).isEqualTo("(1)0(1)")
    }

    @Test
    fun `should nest string 111000`() {
        val result = nestNumberWithParentheses("111000")

        assertThat(result).isEqualTo("(111)000")
    }

    @Test
    fun `should nest string 1`() {
        val result = nestNumberWithParentheses("1")

        assertThat(result).isEqualTo("(1)")
    }
}