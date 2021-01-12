package day16

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PowerSubsetKtTest {
    @Test
    fun `return all subsets for 1,2,3`() {
        val subsets = subsets(intArrayOf(1, 2, 3))

        Assertions.assertEquals(
            listOf(
                listOf(),
                listOf(1),
                listOf(2),
                listOf(1, 2),
                listOf(3),
                listOf(1, 3),
                listOf(2, 3),
                listOf(1, 2, 3)
            ), subsets
        )
    }

    @Test
    fun `return all subsets for 0`() {
        val subsets = subsets(intArrayOf(0))

        Assertions.assertEquals(
            listOf(
                listOf(),
                listOf(0)
            ), subsets
        )
    }
}