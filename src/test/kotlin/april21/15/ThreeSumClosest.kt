package april21.`15`

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ThreeSumClosestTest {
    @Test
    fun `should partition 2,1`() {
        val result = threeSumClosest(intArrayOf(-1, 2, 1, -4), 1)

        Assertions.assertEquals(2, result)
    }
}
