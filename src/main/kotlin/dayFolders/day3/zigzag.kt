package dayFolders.day3

enum class Direction {
    D, U
}

fun zigZagConversion(s: String, numRows: Int): String {
    val levelList = arrayListOf<Int>()
    var result = ""
    var level = 0
    var direction = Direction.D
    for (i in s.indices) {
        levelList.add(level)
        if (direction == Direction.U && level > 0) level--
        else if (direction == Direction.D && level < numRows - 1) level++
        else if (level == numRows - 1 && numRows > 1) {
            level--
            direction = Direction.U
        } else if (level == 0 && numRows > 1) {
            direction = Direction.D
            level++
        }
    }

    for (i in 0 until numRows) {
        levelList.forEachIndexed { index, element ->
            if (element == i) result += s[index]
        }
    }

    return result
}