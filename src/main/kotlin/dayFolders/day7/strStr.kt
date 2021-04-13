package dayFolders.day7

fun strStr(haystack: String, needle: String): Int {
    if (needle.isEmpty()) return 0
    if (haystack.isEmpty()) return -1
    for (i in haystack.indices) {
        if (haystack[i] == needle[0]) {
            val index = checkIfPresent(i, haystack, needle)
            if (index != -1) {
                return index
            }
        }
    }
    return -1
}

fun checkIfPresent(start: Int, haystack: String, needle: String): Int {
    var pos = start
    for (i in needle.indices) {
        if (pos == haystack.length) return -1
        if (needle[i] != haystack[pos]) return -1
        pos++
    }
    return start
}
