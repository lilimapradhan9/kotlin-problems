package april21.`13apr`

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class NextPermutationTest {
    @Test
    fun `find next number for 1,2,3`() {
        val input = intArrayOf(1, 2, 3)
        nextPermutation(input)

        Assertions.assertEquals(intArrayOf(1, 3, 2).toList(), input.toList())
    }

    @Test
    fun `find next number for 3,2,1`() {
        val input = intArrayOf(3, 2, 1)
        nextPermutation(input)

        Assertions.assertEquals(intArrayOf(1, 2, 3).toList(), input.toList())
    }

    @Test
    fun `find next number for 1,1,5`() {
        val input = intArrayOf(1, 1, 5)
        nextPermutation(input)

        Assertions.assertEquals(intArrayOf(1, 5, 1).toList(), input.toList())
    }

    @Test
    fun `find next number for 1`() {
        val input = intArrayOf(1)
        nextPermutation(input)

        Assertions.assertEquals(intArrayOf(1).toList(), input.toList())
    }
}