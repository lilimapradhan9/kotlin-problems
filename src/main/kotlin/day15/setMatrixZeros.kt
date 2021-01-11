package day15

fun setZeroes(matrix: Array<IntArray>): Unit {
    val rowsZero = mutableListOf<Int>()
    val columnsZero = mutableListOf<Int>()

    (matrix.indices).forEach { x ->
        (matrix[0].indices).forEach { y ->
            if(matrix[x][y] == 0) {
                rowsZero.add(x)
                columnsZero.add(y)
            }
        }
    }

    rowsZero.forEach { x ->
        (matrix[0].indices).forEach { y ->
            matrix[x][y] = 0
        }
    }
    columnsZero.forEach { y ->
        (matrix.indices).forEach { x ->
            matrix[x][y] = 0
        }
    }
}