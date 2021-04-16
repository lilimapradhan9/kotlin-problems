package april21.`16`

fun removeDuplicates(S: String): String {
    val charArray = S.toCharArray()
    var j = 0
    for (i in 1 until S.length) {
        when {
            j < 0 || charArray[j] != charArray[i] -> charArray[++j] = charArray[i]
            charArray[i] == charArray[j] -> j--
        }
    }
    return String(charArray, 0, j + 1)
}