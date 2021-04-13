package dayFolders.day20

fun isPalindrome(s: String): Boolean {
    val withoutSpaces = s.toLowerCase().replace(Regex("[^a-z0-9]*"), "")
    val startingPoint = if (withoutSpaces.length % 2 == 0) withoutSpaces.length / 2 else withoutSpaces.length / 2 + 1
    var endingPoint = withoutSpaces.length / 2 - 1
    for (i in startingPoint until withoutSpaces.length) {
        if (withoutSpaces[i] == withoutSpaces[endingPoint])
            endingPoint--
        else return false
    }
    return true
}