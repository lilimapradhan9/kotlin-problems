package april21.a18

import java.util.*
import kotlin.collections.ArrayList


fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
    Arrays.sort(nums)

    val result: MutableList<List<Int>> = ArrayList()
    val len = nums.size
    var firstNoIndex = 0
    while (firstNoIndex < len - 3) {
        var secondNoIndex = firstNoIndex + 1
        while (secondNoIndex < len - 2) {
            var low = secondNoIndex + 1
            var high = len - 1
            while (low < high) {
                val sum = nums[firstNoIndex] + nums[secondNoIndex] + nums[low] + nums[high]
                when {
                    sum == target -> {
                        result.add(listOf(nums[firstNoIndex], nums[secondNoIndex], nums[low], nums[high]))
                        while (low < high && nums[low] == nums[low + 1]) low++
                        while (high > 1 && nums[high] == nums[high - 1]) high--
                        low++
                        high--
                    }
                    sum < target -> low++
                    else -> high--
                }
            }
            while (secondNoIndex < len - 1 && nums[secondNoIndex] == nums[secondNoIndex + 1]) secondNoIndex++
            secondNoIndex++
        }
        while (firstNoIndex < len - 1 && nums[firstNoIndex] == nums[firstNoIndex + 1]) firstNoIndex++
        firstNoIndex++
    }
    return result
}