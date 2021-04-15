package april21.`15`

import kotlin.math.abs

fun threeSumClosest(nums: IntArray, target: Int): Int {
    var minimumDiff = Int.MAX_VALUE

    nums.sort()

    for (i in 0..nums.size - 3) {
        var left = i + 1;
        var right = nums.size - 1

        while (left < right) {
            val currentSum = nums[i] + nums[left] + nums[right]
            val diffWithTarget = currentSum - target

            if (abs(diffWithTarget) < abs(minimumDiff))
                minimumDiff = diffWithTarget

            when {
                diffWithTarget < 0 -> left++
                diffWithTarget > 0 -> right--
                else -> return currentSum
            }
        }
    }

    return target + minimumDiff
}