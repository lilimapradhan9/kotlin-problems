package dayFolders.day24

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MinStackTest {
    @Test
    fun `should return the min number`() {
        val minStack = MinStack()
        minStack.push(-2)
        minStack.push(0)
        minStack.push(-3)
        Assertions.assertEquals(-3, minStack.getMin())

        minStack.pop()
        Assertions.assertEquals(0, minStack.top())

        Assertions.assertEquals(-2, minStack.getMin())
    }
}