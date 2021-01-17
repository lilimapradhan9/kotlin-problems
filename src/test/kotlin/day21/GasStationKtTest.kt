package day21

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class GasStationKtTest {
    @Test
    fun `should return the starting point for 1,2,3,4,5 stations`() {
        val startingPoint = canCompleteCircuit(intArrayOf(1, 2, 3, 4, 5), intArrayOf(3, 4, 5, 1, 2))

        Assertions.assertEquals(3, startingPoint)
    }

    @Test
    fun `should return the starting point for 2,3,4 stations`() {
        val startingPoint = canCompleteCircuit(intArrayOf(2, 3, 4), intArrayOf(3, 4, 3))

        Assertions.assertEquals(-1, startingPoint)
    }

    @Test
    fun `should return the starting point for 1,2,3,4,5 stations two pointer`() {
        val startingPoint = canCompleteCircuitTwoPointer(intArrayOf(1, 2, 3, 4, 5), intArrayOf(3, 4, 5, 1, 2))

        Assertions.assertEquals(3, startingPoint)
    }

    @Test
    fun `should return the starting point for 2,3,4 stations two pointer`() {
        val startingPoint = canCompleteCircuitTwoPointer(intArrayOf(2, 3, 4), intArrayOf(3, 4, 3))

        Assertions.assertEquals(-1, startingPoint)
    }
}