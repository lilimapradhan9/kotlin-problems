package dayFolders.day12

fun rotate(matrix: Array<IntArray>): Array<IntArray> {
    transpose(matrix.size, matrix)
    reverse(matrix.size, matrix)
    return matrix
}

private fun reverse(n: Int, matrix: Array<IntArray>) {
    for (i in 0 until n) {
        for (j in 0 until n / 2) {
            val tmp = matrix[i][j]
            matrix[i][j] = matrix[i][n - j - 1]
            matrix[i][n - j - 1] = tmp
        }
    }
}

private fun transpose(n: Int, matrix: Array<IntArray>) {
    for (i in 0 until n) {
        for (j in i until n) {
            val tmp = matrix[j][i]
            matrix[j][i] = matrix[i][j]
            matrix[i][j] = tmp
        }
    }
}