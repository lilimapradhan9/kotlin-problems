package april21.`13apr`

class NestedInteger {

    fun isInteger(): Boolean {
        TODO("Not yet implemented")
    }

    fun getInteger(): Int? {
        TODO("Not yet implemented")
    }

    fun getList(): List<NestedInteger>? {
        TODO("Not yet implemented")
    }
}


class NestedIterator(nestedList: List<NestedInteger>) {
    private var listOfIntegers = mutableListOf<Int>()
    private var currentIndex = 0

    init {
        flattenList(nestedList, listOfIntegers)
    }

    private fun flattenList(nestedList: List<NestedInteger>, listOfIntegers: MutableList<Int>) {
        nestedList.forEach { nestedInteger ->
            if (nestedInteger.isInteger()) {
                listOfIntegers.add(nestedInteger.getInteger()!!)
            } else {
                flattenList(nestedInteger.getList()!!, listOfIntegers)
            }
        }
    }

    fun next(): Int = listOfIntegers[currentIndex++]

    fun hasNext(): Boolean = currentIndex < listOfIntegers.size
}
