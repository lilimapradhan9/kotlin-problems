package dayFolders.day12

fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): IntArray {
    var firstArrayIter = m - 1
    var secondArrayIter = n - 1
    var totalLength = m + n - 1
    while (firstArrayIter >= 0 && secondArrayIter >= 0)
        nums1[totalLength--] = if (nums1[firstArrayIter] >= nums2[secondArrayIter])
            nums1[firstArrayIter--]
        else nums2[secondArrayIter--]
    while (secondArrayIter >= 0)
        nums1[totalLength--] = nums2[secondArrayIter--]

    return nums1
}