package dayFolders.day11

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PermutationsOfArrayKtTest {
    @Test
    fun `should return permutations for 1,2,3`() {
        val permutations = permute(intArrayOf(1, 2, 3))

        Assertions.assertEquals(listOf(1, 2, 3), permutations[0])
        Assertions.assertEquals(listOf(1, 3, 2), permutations[1])
        Assertions.assertEquals(listOf(2, 1, 3), permutations[2])
        Assertions.assertEquals(listOf(2, 3, 1), permutations[3])
        Assertions.assertEquals(listOf(3, 1, 2), permutations[4])
        Assertions.assertEquals(listOf(3, 2, 1), permutations[5])
    }
}