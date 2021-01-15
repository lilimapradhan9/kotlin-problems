package day19

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PascalTriangleKtTest {
    @Test
    fun `should generate pascal triangle for n=5`() {
        val triangle = generate(5)

        Assertions.assertEquals(
            listOf(
                listOf(1),
                listOf(1, 1),
                listOf(1, 2, 1),
                listOf(1, 3, 3, 1),
                listOf(1, 4, 6, 4, 1)
            ), triangle
        )
    }
}