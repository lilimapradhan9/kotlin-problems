package dayFolders.day5

fun threeSum(nums: IntArray): List<List<Int>> {
    val result = mutableSetOf<List<Int>>()
    for (i in 0 until nums.size - 2) {

        nums.sort()

        println(nums.toList())

        var left = i + 1
        var right = nums.size - 1
        while (left < right) {
            if (nums[i] + nums[left] + nums[right] == 0) {
                result.add(listOf(nums[i], nums[left], nums[right]))
                left++
            } else if (nums[i] + nums[left] + nums[right] < 0) left++
            else right--
        }
    }

    return result.toList()
}