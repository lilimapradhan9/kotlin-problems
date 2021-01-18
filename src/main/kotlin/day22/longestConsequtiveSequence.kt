package day22

fun longestConsecutive(nums: IntArray): Int {
    val numberSet = nums.toHashSet()

    var longestStreak = 0
    for (num in numberSet) {
        if (!numberSet.contains(num - 1)) {
            var currentNum = num
            var currentStreak = 1
            while (numberSet.contains(currentNum + 1)) {
                currentNum += 1
                currentStreak += 1
            }
            longestStreak = Math.max(longestStreak, currentStreak)
        }
    }
    return longestStreak
}