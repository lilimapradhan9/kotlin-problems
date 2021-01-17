package day21

import java.util.*


fun partition(s: String): List<List<String>> {
    val result: MutableList<List<String>> = ArrayList()
    dfs(0, result, ArrayList(), s)
    return result
}

fun dfs(start: Int, result: MutableList<List<String>>, currentList: MutableList<String>, s: String) {
    if (start >= s.length) result.add(ArrayList(currentList))
    for (end in start until s.length) {
        if (isPalindrome(s, start, end)) {
            currentList.add(s.substring(start, end + 1))
            dfs(end + 1, result, currentList, s)
            currentList.removeAt(currentList.size - 1)
        }
    }
}

fun isPalindrome(s: String, low: Int, high: Int): Boolean {
    var low = low
    var high = high
    while (low < high) {
        if (s[low++] != s[high--]) return false
    }
    return true
}