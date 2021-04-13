package dayFolders.day4


fun maxArea(height: IntArray): Int {
    var result = 0
    var left = 0
    var right = height.size - 1
    while (left < right) {
        val area = (right - left) * minOf(height[left], height[right])
        result = maxOf(area, result)

        if (height[left] < height[right]) left += 1
        else right -= 1
    }
    return result
}