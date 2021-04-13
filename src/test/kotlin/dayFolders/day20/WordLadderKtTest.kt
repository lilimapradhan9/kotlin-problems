package dayFolders.day20

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class WordLadderKtTest {
    @Test
    fun `should return the length of shortest transformation sequence`() {
        val ladderLength = ladderLength("hit", "cog", listOf("hot", "dot", "dog", "lot", "log", "cog"))

        Assertions.assertEquals(5, ladderLength)
    }

    @Test
    fun `should return the 0`() {
        val ladderLength = ladderLength("hit", "cog", listOf("hot", "dot", "dog", "lot", "log"))

        Assertions.assertEquals(0, ladderLength)
    }
}