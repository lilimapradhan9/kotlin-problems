package dayFolders.day27

var gridlength = 0
var gridBreadth = 0

fun numIslands(grid: Array<CharArray>): Int {
    var count = 0
    gridlength = grid.size
    if (gridlength == 0) return 0
    gridBreadth = grid[0].size
    for (i in 0 until gridlength) {
        for (j in 0 until gridBreadth) if (grid[i][j] == '1') {
            dfs(grid, i, j)
            ++count
        }
    }
    return count
}

private fun dfs(grid: Array<CharArray>, i: Int, j: Int) {
    if (i < 0 || j < 0 || i >= gridlength || j >= gridBreadth || grid[i][j] != '1') return
    grid[i][j] = '0'
    dfs(grid, i + 1, j)
    dfs(grid, i - 1, j)
    dfs(grid, i, j + 1)
    dfs(grid, i, j - 1)
}