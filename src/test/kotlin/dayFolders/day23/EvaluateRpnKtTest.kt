package dayFolders.day23

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class EvaluateRpnKtTest {
    @Test
    fun `should return the result for "2", "1", "+", "3", "*"`() {
        val evalRPN = evalRPN(arrayOf("2", "1", "+", "3", "*"))

        Assertions.assertEquals(9, evalRPN)
    }

    @Test
    fun `should return the result for "4", "13", "5", "slash", "+"`() {
        val evalRPN = evalRPN(arrayOf("4", "13", "5", "/", "+"))

        Assertions.assertEquals(6, evalRPN)
    }

    @Test
    fun `should return the result for "10", "6", "9", "3", "+", "-11", "*", "slash", "*", "17", "+", "5", "+"`() {
        val evalRPN = evalRPN(arrayOf("10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"))

        Assertions.assertEquals(22, evalRPN)
    }
}