package day16

fun exist(board: Array<CharArray>, word: String): Boolean {
    val arr = word.toCharArray()
    for (i in board.indices) {
        for (j in board[0].indices) {
            if (board[i][j] == arr[0] && dfs(board, arr, 0, i, j)) {
                return true
            }
        }
    }
    return false
}

fun dfs(
    board: Array<CharArray>,
    arr: CharArray,
    count: Int,
    row: Int,
    col: Int
): Boolean {
    if (row < 0 || row >= board.size || col < 0 || col >= board[0].size || board[row][col] != arr[count])
        return false

    if (count == arr.size - 1)
        return true

    val temp = board[row][col]
    board[row][col] = ' '
    val exists = (
            dfs(board, arr, count + 1, row + 1, col) ||
                    dfs(board, arr, count + 1, row - 1, col) ||
                    dfs(board, arr, count + 1, row, col + 1) ||
                    dfs(board, arr, count + 1, row, col - 1))
    board[row][col] = temp
    return exists
}