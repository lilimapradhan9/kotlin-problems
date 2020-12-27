package day3

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ZigzagKtTest {
    @Test
    fun `should return the zigzag string for input and row count 3`() {
        val zigzag = zigZagConversion("PAYPALISHIRING", 3)

        Assertions.assertEquals("PAHNAPLSIIGYIR", zigzag)
    }

    @Test
    fun `should return the zigzag string for input and row count 4`() {
        val zigzag = zigZagConversion("PAYPALISHIRING", 4)

        Assertions.assertEquals("PINALSIGYAHRPI", zigzag)
    }

    @Test
    fun `should return the zigzag string for input A and row count 1`() {
        val zigzag = zigZagConversion("A", 1)

        Assertions.assertEquals("A", zigzag)
    }

    @Test
    fun `should return the zigzag string for input AB and row count 1`() {
        val zigzag = zigZagConversion("AB", 1)

        Assertions.assertEquals("AB", zigzag)
    }
}