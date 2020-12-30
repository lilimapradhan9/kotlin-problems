package day6

fun generate(
    result: MutableList<String>,
    string: String,
    length: Int,
    numberOfOpenBraces: Int,
    numberOfclodedBrace: Int
) {
    if (numberOfclodedBrace == length) {
        result.add(string)
        return
    } else {
        if (numberOfOpenBraces > numberOfclodedBrace) {
            generate(result, "$string)", length, numberOfOpenBraces, numberOfclodedBrace + 1)
        }
        if (numberOfOpenBraces < length) {
            generate(result, "$string(", length, numberOfOpenBraces + 1, numberOfclodedBrace)
        }
    }
}


fun generateParenthesis(n: Int): List<String> {
    val result = mutableListOf<String>()
    generate(result, "", n, 0, 0)

    return result
}