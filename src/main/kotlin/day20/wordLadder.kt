package day20

import java.util.*

fun ladderLength(beginWord: String, endWord: String, wordList: List<String>): Int {
    val setOfWords = wordList.toMutableSet()
    if (!setOfWords.contains(endWord)) return 0

    val queue: Queue<String> = LinkedList()
    var level = 1
    queue.offer(beginWord)

    while (queue.isNotEmpty()) {
        val size = queue.size
        for (i in 0 until size) {
            val currentWordLetters = queue.poll().toCharArray()

            for (j in currentWordLetters.indices) {
                val originalChar = currentWordLetters[j]
                for (c in 'a'..'z') {
                    if (currentWordLetters[j] == c) continue
                    currentWordLetters[j] = c
                    val newWord = currentWordLetters.joinToString("")
                    if (newWord == endWord) return level + 1
                    if (setOfWords.contains(newWord)) {
                        queue.offer(newWord)
                        setOfWords.remove(newWord)
                    }
                }
                currentWordLetters[j] = originalChar
            }
        }
        level++
    }
    return 0
}