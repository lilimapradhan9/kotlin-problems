package april21.`16`

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class RemoveDuplicates2Test {

    @Test
    fun `should remove duplicates in abbaca`() {
        val result = removeDuplicates("abcd", 2)

        Assertions.assertEquals("abcd", result)
    }

    @Test
    fun `should remove duplicates in deeedbbcccbdaa`() {
        val result = removeDuplicates("deeedbbcccbdaa", 2)

        Assertions.assertEquals("aa", result)
    }

    @Test
    fun `should remove duplicates in pbbcggttciiippooaais`() {
        val result = removeDuplicates("pbbcggttciiippooaais", 2)

        Assertions.assertEquals("ps", result)
    }

}