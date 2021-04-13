package dayFolders.day8

fun isValidSudoku(board: Array<CharArray>): Boolean {
    val presenceInRow = Array(9) { BooleanArray(10) }
    val presenceInColumn = Array(9) { BooleanArray(10) }
    val presenceIngrid = Array(9) { BooleanArray(10) }


    for (rowIndex in board.indices) {
        val row = board[rowIndex]
        for (columnIndex in row.indices) {
            val char = row[columnIndex]
            if (char != '.') {
                val digit = char - '0'
                val gridIndex = ((rowIndex / 3) * 3) + (columnIndex / 3)
                if (presenceInRow[rowIndex][digit] || presenceInColumn[columnIndex][digit] || presenceIngrid[gridIndex][digit])
                    return false
                else {
                    presenceInRow[rowIndex][digit] = true
                    presenceInColumn[columnIndex][digit] = true
                    presenceIngrid[gridIndex][digit] = true
                }
            }
        }
    }
    return true
}