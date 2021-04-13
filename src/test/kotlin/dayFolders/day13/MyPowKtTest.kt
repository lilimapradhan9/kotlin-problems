package dayFolders.day13

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MyPowKtTest {
    @Test
    fun `should return result of 2 to power 10`() {
        val result = myPow(2.00000, 10)

        Assertions.assertEquals(1024.00000, result)
    }

    @Test
    fun `should return result of 2 point 1 to power 3`() {
        val result = myPow(2.10000, 3)

        Assertions.assertEquals(9.261000000000001, result)
    }

    @Test
    fun `should return result of 2 to power -2`() {
        val result = myPow(2.00000, -2)

        Assertions.assertEquals(0.25000, result)
    }
}