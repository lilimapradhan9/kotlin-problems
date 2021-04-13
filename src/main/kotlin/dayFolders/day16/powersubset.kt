package dayFolders.day16

fun subsets(nums: IntArray): List<List<Int>> {
    val result = mutableListOf(emptyList<Int>())
    nums.forEach { num ->
        result.addAll(result.map { it + num })
    }
    return result
}


