package april21.a19


fun diffWaysToCompute(input: String): List<Int> {
    val res: MutableList<Int> = ArrayList()
    for (i in input.indices) {
        val character = input[i]
        if (character == '+' || character == '-' || character == '*') {
            val left = diffWaysToCompute(input.substring(0, i))
            val right = diffWaysToCompute(input.substring(i + 1))
            for (l in left) {
                for (r in right) {
                    when (character) {
                        '+' -> res.add(l + r)
                        '-' -> res.add(l - r)
                        '*' -> res.add(l * r)
                    }
                }
            }
        }
    }
    if (res.size == 0) {
        res.add(Integer.valueOf(input))
    }
    return res
}