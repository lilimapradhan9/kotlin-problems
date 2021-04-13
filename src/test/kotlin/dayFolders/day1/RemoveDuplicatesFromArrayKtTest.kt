package dayFolders.day1

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class RemoveDuplicatesFromArrayKtTest {

    @Test
    fun `remove duplicates from array 1,1,2`() {
        val arrayLength = removeDuplicates(intArrayOf(1, 1, 2))

        Assertions.assertEquals(2, arrayLength)
    }

    @Test
    fun `remove duplicates from array 0,0,1,1,1,2,2,3,3,4`() {
        val arrayLength = removeDuplicates(intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4))

        Assertions.assertEquals(5, arrayLength)
    }

    @Test
    fun `remove duplicates from empty array`() {
        val arrayLength = removeDuplicates(intArrayOf())

        Assertions.assertEquals(0, arrayLength)
    }
}