package day16

import java.util.*

fun largestRectangleArea(h: IntArray): Int {
    var iter = 0
    var largestArea = 0
    val s = Stack<Int>()
    while (iter < h.size) {
        while (!s.isEmpty() && h[iter] < h[s.peek()]) {
            largestArea = Math.max(largestArea, h[s.pop()] * (iter - if (s.isEmpty()) 0 else s.peek() + 1))
        }
        s.push(iter++)
    }

    while (!s.isEmpty()) {
        largestArea = Math.max(largestArea, h[s.pop()] * (h.size - if (s.isEmpty()) 0 else s.peek() + 1))
    }
    return largestArea
}