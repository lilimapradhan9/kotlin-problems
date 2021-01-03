package day10

fun trap(height: IntArray): Int {
    var result = 0
    val size = height.size
    val leftMax = IntArray(size)
    val rightMax = IntArray(size)
    leftMax[0] = height[0]
    rightMax[size - 1] = height[size - 1];

    for (i in 1 until size) {
        leftMax[i] = Math.max(height[i], leftMax[i - 1]);
    }
    for (i in size-2 downTo 0) {
        rightMax[i] = Math.max(height[i], rightMax[i + 1]);
    }
    for (i in 1 until size) {
        result += Math.min(leftMax[i], rightMax[i]) - height[i];
    }
    return result;
}