package april21.`17`


fun numSubmatrixSumTarget(matrix: Array<IntArray>, target: Int): Int {
    val rows = matrix.size
    val columns = matrix[0].size
    val sum = Array(rows) { IntArray(columns) { 0 } }

    for (x in 0 until rows) {
        for (y in 0 until columns) {
            sum[x][y] = matrix[x][y]
            if (x > 0) sum[x][y] += sum[x - 1][y]
            if (y > 0) sum[x][y] += sum[x][y - 1]
            if (x > 0 && y > 0) sum[x][y] -= sum[x - 1][y - 1]
        }
    }

    var result = 0
    for (startRow in 0 until rows) {
        for (currentRow in startRow until rows) {
            val mapOfSum = mutableMapOf(0 to 1)
            for (currentCol in 0 until columns) {
                val currentSum = sum[currentRow][currentCol] - (if (startRow - 1 >= 0) sum[startRow - 1][currentCol] else 0)
                result += mapOfSum.getOrDefault(currentSum - target, 0)
                mapOfSum[currentSum] = mapOfSum.getOrDefault(currentSum, 0) + 1
            }
        }
    }
    return result
}