package dayFolders.day21

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SurroundedRegionsKtTest {
    @Test
    fun `should solve board`() {
        val board = arrayOf(
            charArrayOf('X', 'X', 'X', 'X'),
            charArrayOf('X', 'O', 'O', 'X'),
            charArrayOf('X', 'X', 'O', 'X'),
            charArrayOf('X', 'O', 'X', 'X')
        )

        solve(board)

        Assertions.assertEquals(charArrayOf('X', 'X', 'X', 'X').toList(), board[0].toList())
        Assertions.assertEquals(charArrayOf('X', 'X', 'X', 'X').toList(), board[1].toList())
        Assertions.assertEquals(charArrayOf('X', 'X', 'X', 'X').toList(), board[2].toList())
        Assertions.assertEquals(charArrayOf('X', 'O', 'X', 'X').toList(), board[3].toList())
    }
}