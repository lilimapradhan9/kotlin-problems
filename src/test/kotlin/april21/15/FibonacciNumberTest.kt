package april21.`15`

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FibonacciNumberTest {
    @Test
    fun `should give Fibonacci number for 2`() {
        val result = fib(2)

        Assertions.assertEquals(1, result)
    }

    @Test
    fun `should give Fibonacci number for 3`() {
        val result = fib(3)

        Assertions.assertEquals(2, result)
    }

    @Test
    fun `should give Fibonacci number for 4`() {
        val result = fib(4)

        Assertions.assertEquals(3, result)
    }
}