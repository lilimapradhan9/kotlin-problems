package day21

fun singleNumber(nums: IntArray): Int {
    val setOfNumbers = mutableSetOf<Int>()
    for (i in nums.indices) {
        if (setOfNumbers.contains(nums[i]))
            setOfNumbers.remove(nums[i])
        else setOfNumbers.add(nums[i])
    }

    return setOfNumbers.single()
}