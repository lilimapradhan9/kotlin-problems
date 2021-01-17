package day21

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PalindromePartitioningKtTest {
    @Test
    fun `return all palindrome for aab`() {
        val partitions = partition("aab")

        Assertions.assertEquals(listOf(listOf("a", "a", "b"), listOf("aa", "b")), partitions)
    }

    @Test
    fun `return all palindrome for a`() {
        val partitions = partition("a")

        Assertions.assertEquals(listOf(listOf("a")), partitions)
    }
}