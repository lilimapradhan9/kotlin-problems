package dayFolders.day24

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MissingRangesKtTest {
    @Test
    fun `should return the missing ranges for 0, 1, 3, 50, 75`() {
        val missingRanges = findMissingRanges(intArrayOf(0, 1, 3, 50, 75), 0, 99)

        Assertions.assertEquals(intArrayOf(2).toList(), missingRanges[0].toList())
        Assertions.assertEquals(intArrayOf(4, 49).toList(), missingRanges[1].toList())
        Assertions.assertEquals(intArrayOf(51, 74).toList(), missingRanges[2].toList())
        Assertions.assertEquals(intArrayOf(76, 99).toList(), missingRanges[3].toList())
    }
}