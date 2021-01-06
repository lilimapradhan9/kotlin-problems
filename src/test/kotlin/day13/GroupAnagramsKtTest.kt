package day13

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class GroupAnagramsKtTest {
    @Test
    fun `should group anagrams for "eat","tea","tan","ate","nat","bat"`() {
        val groupedAnagrams = groupAnagrams(arrayOf("eat", "tea", "tan", "ate", "nat", "bat"))

        Assertions.assertEquals(
            listOf(listOf("eat", "tea", "ate"), listOf("tan", "nat"), listOf("bat")),
            groupedAnagrams
        )
    }

    @Test
    fun `should group anagrams for empty array`() {
        val groupedAnagrams = groupAnagrams(arrayOf(""))

        Assertions.assertEquals(listOf(listOf("")), groupedAnagrams)
    }

    @Test
    fun `should group anagrams for array with single char`() {
        val groupedAnagrams = groupAnagrams(arrayOf("a"))

        Assertions.assertEquals(listOf(listOf("a")), groupedAnagrams)
    }
}