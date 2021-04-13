package april21.`13apr`

fun nextPermutation(nums: IntArray) {
    var i = nums.lastIndex - 1
    while (i >= 0 && nums[i + 1] <= nums[i]) {
        i--
    }
    if (i >= 0) {
        var j = nums.size - 1
        while (j >= 0 && nums[j] <= nums[i]) {
            j--
        }
        nums.swap(i, j)
    }
    nums.reverse(i + 1)
}

fun IntArray.reverse(start: Int = 0, end: Int = lastIndex) {
    var i = start
    var j = size - 1
    while (i < j) {
        swap(i, j)
        i++
        j--
    }
}

fun IntArray.swap(i: Int, j: Int) {
    val temp = get(i)
    set(i, get(j))
    set(j, temp)
}