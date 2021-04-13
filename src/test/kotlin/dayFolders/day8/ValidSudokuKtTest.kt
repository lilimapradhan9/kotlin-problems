package dayFolders.day8

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ValidSudokuKtTest {
    @Test
    fun `should give true for valid sudoku`() {
        val validSudoku = isValidSudoku(
            arrayOf(
                charArrayOf('5', '3', '.', '.', '7', '.', '.', '.', '.')
                , charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.')
                , charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.')
                , charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3')
                , charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1')
                , charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6')
                , charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.')
                , charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5')
                , charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')
            )
        )

        Assertions.assertTrue(validSudoku)
    }

    @Test
    fun `should give false for invalid sudoku`() {
        val validSudoku = isValidSudoku(
            arrayOf(
                charArrayOf('8', '3', '.', '.', '7', '.', '.', '.', '.')
                , charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.')
                , charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.')
                , charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3')
                , charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1')
                , charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6')
                , charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.')
                , charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5')
                , charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')
            )
        )

        Assertions.assertFalse(validSudoku)
    }
}