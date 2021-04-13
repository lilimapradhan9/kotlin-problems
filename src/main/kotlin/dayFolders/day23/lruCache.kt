package dayFolders.day23

class LRUCache(private val capacity: Int) {
    private val cache = LinkedHashMap<Int, Int>(capacity)
    fun get(key: Int): Int {
        val value = cache.remove(key) ?: return -1
        cache[key] = value
        return value
    }

    fun put(key: Int, value: Int) {
        cache.remove(key)
        if (cache.size == capacity) cache.remove(cache.keys.first())
        cache[key] = value
    }
}

class LRUCacheLL(private val capacity: Int) {
    private class Node(val key: Int, var value: Int) {
        var prev = dummy
        var next = dummy

        constructor() : this(0, 0)

        companion object {
            val dummy = Node()
        }
    }

    private val head = Node()
    private val map = mutableMapOf<Int, Node>()

    init {
        head.next = head
        head.prev = head
    }

    fun get(key: Int) = map[key]?.let {
        remove(it)
        add(it)
        it.value
    } ?: -1

    fun put(key: Int, value: Int) {
        map[key]?.let {
            remove(it)
            add(it)
            it.value = value
            return
        }

        if (map.size == capacity) {
            val node = head.next
            remove(node)
            map.remove(node.key)
        }

        val node = Node(key, value)
        add(node)
        map[key] = node
    }

    private fun remove(node: Node) {
        node.prev.next = node.next
        node.next.prev = node.prev
    }

    private fun add(node: Node) {
        node.prev = head.prev
        node.next = head
        head.prev.next = node
        head.prev = node
    }
}