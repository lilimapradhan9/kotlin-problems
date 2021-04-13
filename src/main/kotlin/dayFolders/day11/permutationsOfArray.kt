package dayFolders.day11

fun permute(nums: IntArray): List<List<Int>> {
    val result = mutableListOf<MutableList<Int>>()
    val state = nums.indices.toMutableSet()

    permute(nums, state, mutableListOf(), result)
    return result
}

fun permute(nums: IntArray, state: Set<Int>, permutation: MutableList<Int>, result: MutableList<MutableList<Int>>) {
    if (state.isEmpty()) {
        result.add(permutation)
        return
    }
    state.forEach {
        val newState = state.toMutableSet()
        newState.remove(it)
        permute(nums, newState, (permutation + nums[it]).toMutableList(), result)
    }
}
