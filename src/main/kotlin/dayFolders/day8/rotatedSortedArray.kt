package dayFolders.day8

fun findTurningPoint(nums: IntArray): Int {
    var startPoint = 0;
    var endPoint = nums.size

    while (startPoint < endPoint) {
        val midPoint = (startPoint + endPoint) / 2
        if (nums.last() >= nums[midPoint])
            endPoint = midPoint
        else
            startPoint = midPoint + 1
    }
    return startPoint
}

fun lowerBound(nums: IntArray, target: Int, start: Int, end: Int): Int {
    var startPoint = start;
    var endPoint = end

    while (startPoint < endPoint) {
        val midPoint = (startPoint + endPoint) / 2
        if (nums[midPoint] >= target)
            endPoint = midPoint
        else
            startPoint = midPoint + 1
    }

    return if (startPoint == end || nums[startPoint] != target) -1 else startPoint
}

fun search(nums: IntArray, target: Int): Int {
    val turningPoint = findTurningPoint(nums)
    val result = lowerBound(nums, target, 0, turningPoint)

    return if (result == -1) lowerBound(nums, target, turningPoint, nums.size) else result
}