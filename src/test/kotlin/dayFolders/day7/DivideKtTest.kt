package dayFolders.day7

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class DivideKtTest {
    @Test
    fun `should divide 10 by 3`() {
        val quotient = divide(10, 3)

        Assertions.assertEquals(3, quotient)
    }

    @Test
    fun `should divide 7 by -3`() {
        val quotient = divide(7, -3)

        Assertions.assertEquals(-2, quotient)
    }

    @Test
    fun `should divide -7 by -3`() {
        val quotient = divide(-7, -3)

        Assertions.assertEquals(2, quotient)
    }

    @Test
    fun `should divide -7 by 3`() {
        val quotient = divide(-7, 3)

        Assertions.assertEquals(-2, quotient)
    }

    @Test
    fun `should divide 0 by 1`() {
        val quotient = divide(0, 1)

        Assertions.assertEquals(0, quotient)
    }

    @Test
    fun `should divide 1 by 1`() {
        val quotient = divide(1, 1)

        Assertions.assertEquals(1, quotient)
    }


    @Test
    fun `should divide -2147483648 by -1`() {
        val quotient = divide(-2147483648, -1)

        Assertions.assertEquals(2147483647, quotient)
    }
}