package dayFolders.day23

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class LRUCacheTest {
    @Test
    fun `should create lru cache`() {
        val lruCache = LRUCache(2)

        lruCache.put(1, 1)
        lruCache.put(2, 2)
        Assertions.assertEquals(1, lruCache.get(1))
        lruCache.put(3, 3)
        Assertions.assertEquals(-1, lruCache.get(2))
        lruCache.put(4, 4)
        Assertions.assertEquals(-1, lruCache.get(1))
        Assertions.assertEquals(3, lruCache.get(3))
        Assertions.assertEquals(4, lruCache.get(4))
    }

    @Test
    fun `should create lru cache using dll`() {
        val lruCache = LRUCacheLL(2)

        lruCache.put(1, 1)
        lruCache.put(2, 2)
        Assertions.assertEquals(1, lruCache.get(1))
        lruCache.put(3, 3)
        Assertions.assertEquals(-1, lruCache.get(2))
        lruCache.put(4, 4)
        Assertions.assertEquals(-1, lruCache.get(1))
        Assertions.assertEquals(3, lruCache.get(3))
        Assertions.assertEquals(4, lruCache.get(4))
    }
}