package day14

fun spiralOrder(matrix: Array<IntArray>): List<Int> {
    val result = mutableSetOf<Int>()
    if (matrix.isEmpty()) return emptyList()
    var rowEnd = matrix.size - 1
    var colEnd = matrix[0].size - 1
    var rowStart = 0
    var colStart = 0
    while (rowStart <= rowEnd && colStart <= colEnd) {

        for (iter in colStart..colEnd)
            result.add(matrix[rowStart][iter])
        rowStart += 1
        for (iter in rowStart..rowEnd)
            result.add(matrix[iter][colEnd])
        colEnd -= 1
        for (iter in colEnd downTo colStart)
            result.add(matrix[rowEnd][iter])
        rowEnd -= 1
        for (iter in rowEnd downTo rowStart)
            result.add(matrix[iter][colStart])
        colStart += 1
    }
    return result.toList()
}