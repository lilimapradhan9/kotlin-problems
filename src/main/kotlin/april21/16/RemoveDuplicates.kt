package april21.`16`

fun removeDuplicates(S: String): String {
    val charArray = S.toCharArray()
    var index = 0
    for (i in 1 until S.length) {
        when {
            index < 0 || charArray[index] != charArray[i] -> charArray[++index] = charArray[i]
            charArray[i] == charArray[index] -> index--
        }
    }
    return String(charArray, 0, index + 1)
}