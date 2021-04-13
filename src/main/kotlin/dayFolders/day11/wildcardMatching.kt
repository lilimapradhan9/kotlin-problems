package dayFolders.day11

fun isMatch(s: String, p: String): Boolean {
    val stringLength = s.length
    val patternLength = p.length

    val memo = Array(stringLength + 1) { BooleanArray(patternLength + 1) }

    memo[0][0] = true
    for (i in 1..patternLength) {
        memo[0][i] = memo[0][i - 1] && (p[i - 1] == '*')
    }
    for ((stringIter, stringChar) in s.withIndex()) {
        for ((patternIter, patternChar) in p.withIndex()) {
            memo[stringIter + 1][patternIter + 1] = when {
                (memo[stringIter][patternIter] && (stringChar == patternChar || patternChar == '?' || patternChar == '*')) -> true
                ((memo[stringIter][patternIter + 1] || memo[stringIter + 1][patternIter]) && (patternChar == '*')) -> true
                else -> false
            }
        }
    }
    return memo[stringLength][patternLength]
}