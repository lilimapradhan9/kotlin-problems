package dayFolders.day19

fun generate(numRows: Int): List<List<Int>> {
    if (numRows == 0) return listOf()
    val result = mutableListOf<List<Int>>()
    for (i in 0 until numRows) {
        val list = mutableListOf<Int>()
        list.add(1)
        for (j in 1 until i) {
            list.add(result[i - 1][j - 1] + result[i - 1][j])
        }
        if (i - 1 >= 0) list.add(1)
        result.add(list)
    }
    return result
}