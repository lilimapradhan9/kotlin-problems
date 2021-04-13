package dayFolders.day15

fun merge(intervals: Array<IntArray>): Array<IntArray> {
    val resultList = ArrayList<IntArray>()

    intervals.sortBy { it[0] }

    for (interval in intervals) {
        if (resultList.isEmpty() || resultList.last()[1] < interval.first())
            resultList.add(intArrayOf(interval.first(), interval.last()))
        else {
            resultList.last()[1] = Math.max(interval.last(), resultList.last()[1])
        }
    }

    return resultList.toTypedArray()
}