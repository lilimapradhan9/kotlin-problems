package dayFolders.day21

fun canCompleteCircuit(gas: IntArray, cost: IntArray): Int {
    var sum = 0
    var curSum = 0
    var index = 0
    for (i in gas.indices) {
        val diff = gas[i] - cost[i]
        sum += diff
        curSum += diff
        if (curSum < 0) {
            index = (i + 1) % gas.size
            curSum = 0
        }

    }
    return if (sum >= 0) index else -1
}

fun canCompleteCircuitTwoPointer(gas: IntArray, cost: IntArray): Int {
    var start = gas.size - 1
    var end = 0
    var tank = gas[start] - cost[start]

    while (start != end) {
        if (tank >= 0) {
            tank += gas[end] - cost[end]
            end++
        } else {
            start--
            tank += gas[start] - cost[start]
        }
    }
    return if (tank < 0) -1 else start
}