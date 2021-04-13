package dayFolders.day26

fun rotate(nums: IntArray, k: Int) {
    val rotation = k % nums.size
    var count = 0
    var start = 0

    while (count < nums.size) {
        var current = start
        var prev = nums[start]
        do {
            val next = (current + rotation) % nums.size
            val temp = nums[next]
            nums[next] = prev
            prev = temp
            current = next
            count++
        } while (start != current)
        start++
    }
}