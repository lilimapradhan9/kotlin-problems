package day21

fun solve(board: Array<CharArray>) {
    if (board.isEmpty() || board[0].isEmpty()) return
    val row = board.size
    val col: Int = board[0].size

    for (i in 0 until row) {
        for (j in 0 until col) {
            if (i == 0 || i == row - 1 || j == 0 || j == col - 1) {
                dfs(board, row, col, i, j)
            }
        }
    }

    for (i in 0 until row) {
        for (j in 0 until col) {
            if (board[i][j] == '*') board[i][j] = 'O' else board[i][j] = 'X'
        }
    }
}

private fun dfs(board: Array<CharArray>, row: Int, col: Int, i: Int, j: Int) {
    if (i < 0 || i >= row || j < 0 || j >= col) return
    if (board[i][j] == '*' || board[i][j] == 'X') return
    board[i][j] = '*'
    dfs(board, row, col, i, j - 1)
    dfs(board, row, col, i, j + 1)
    dfs(board, row, col, i + 1, j)
    dfs(board, row, col, i - 1, j)
}