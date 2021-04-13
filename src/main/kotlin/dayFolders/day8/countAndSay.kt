package dayFolders.day8

fun countAndSay(n: Int): String {
    if (n == 1) return "1"
    var result = ""
    val str = countAndSay(n - 1)

    var iter = 0
    while (iter < str.length) {
        val char = str[iter]
        var count = 1
        while (iter + 1 < str.length && str[iter + 1] == char) {
            iter++
            count++
        }

        iter++
        result += count.toString() + char
    }

    return result
}
