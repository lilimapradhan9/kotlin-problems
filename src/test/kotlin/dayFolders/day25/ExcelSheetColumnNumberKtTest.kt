package dayFolders.day25

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ExcelSheetColumnNumberKtTest {
    @Test
    fun `convert A`() {
        val number = titleToNumber("A")

        Assertions.assertEquals(1, number)
    }

    @Test
    fun `convert AB`() {
        val number = titleToNumber("AB")

        Assertions.assertEquals(28, number)
    }

    @Test
    fun `convert ZY`() {
        val number = titleToNumber("ZY")

        Assertions.assertEquals(701, number)
    }
}