package dayFolders.day26

fun largestNumber(nums: IntArray): String {
    if (nums.isEmpty()) return ""
    val stringRep = Array(nums.size) { "" }

    nums.forEachIndexed { index, number ->
        stringRep[index] = number.toString()
    }

    stringRep.sortWith(Comparator { a, b -> (b + a).compareTo(a + b) })

    if(stringRep[0][0] == '0') return "0"

    return stringRep.reduce{result, element ->  result + element}
}