package day1

fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    val allElements = mutableListOf<Int>()
    allElements.addAll(nums1.toList())
    allElements.addAll(nums2.toList())
    allElements.sort()

    val midPoint = allElements.size / 2

    if (allElements.size % 2 == 0) {
        return (allElements[midPoint] + allElements[midPoint - 1]) / 2.0
    }
    return allElements[midPoint].toDouble()
}
