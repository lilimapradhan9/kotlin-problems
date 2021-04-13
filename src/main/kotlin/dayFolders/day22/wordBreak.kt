package dayFolders.day22


fun wordBreak(s: String, wordDict: List<String?>): Boolean {
    if (wordDict.contains(s)) return true
    for (i in 1..s.length) {
        val left = s.substring(0, i)
        if (wordDict.contains(left) && wordBreak(s.substring(i), wordDict)) {
            return true
        }
    }
    return false
}


var map = mutableMapOf<String, Boolean>()

fun wordBreakDp(
    s: String,
    wordDict: List<String>
): Boolean {
    if (wordDict.contains(s)) return true

    if (map.containsKey(s)) return map[s]!!

    for (i in 1..s.length) {
        val left = s.substring(0, i)
        if (wordDict.contains(left) && wordBreakDp(s.substring(i), wordDict)) {
            map[s] = true
            return true
        }
    }
    map[s] = false
    return false
}