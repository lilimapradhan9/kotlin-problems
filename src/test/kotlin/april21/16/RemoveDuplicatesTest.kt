package april21.`16`

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class RemoveDuplicatesTest {
    @Test
    fun `should remove duplicates in abbaca`() {
        val result = removeDuplicates("abbaca")

        Assertions.assertEquals("ca", result)
    }

}