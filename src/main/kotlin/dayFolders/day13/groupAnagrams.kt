package dayFolders.day13

import java.util.*

fun groupAnagrams(strs: Array<String>): List<List<String>> {
    if (strs.isEmpty()) return emptyList()

    val ans: MutableMap<String, MutableList<String>> = mutableMapOf()

    for (s in strs) {
        val charArray = s.toCharArray()
        Arrays.sort(charArray)
        val key = String(charArray)
        if (!ans.containsKey(key)) ans[key] = mutableListOf(s)
        else ans[key]?.add(s)
    }
    return ans.values.toList()
}