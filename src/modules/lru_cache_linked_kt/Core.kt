package com.igorkan.modules.lru_cache_linked_kt

class LinkedLruCache<K, V>(private val capacity: Int) : LruContract<K, V> {
    private val map = HashMap<K, LruNode<K, V>>(capacity)
    var head: LruNode<K, V>? = null
        private set
    var tail: LruNode<K, V>? = null
        private set
    var hits: Long = 0L
        private set
    var misses: Long = 0L
        private set
    var evictions: Long = 0L
        private set

    init {
        if (capacity <= 0) throw LruCacheException.InvalidArgument("capacity must be > 0")
    }

    private fun detach(node: LruNode<K, V>) {
        val p = node.prev
        val n = node.next
        if (p != null) p.next = n else head = n
        if (n != null) n.prev = p else tail = p
        node.prev = null
        node.next = null
    }

    private fun pushFront(node: LruNode<K, V>) {
        node.next = head
        head?.prev = node
        head = node
        if (tail == null) tail = node
    }

    override fun get(key: K): V? {
        val node = map[key]
        if (node == null) {
            misses++
            return null
        }
        hits++
        detach(node)
        pushFront(node)
        return node.value
    }

    override fun put(key: K, value: V): V? {
        val existing = map[key]
        if (existing != null) {
            val prev = existing.value
            existing.value = value
            detach(existing)
            pushFront(existing)
            return prev
        }
        if (map.size == capacity) {
            val victim = tail!!
            detach(victim)
            map.remove(victim.key)
            evictions++
        }
        val created = LruNode(key, value)
        map[key] = created
        pushFront(created)
        return null
    }

    override fun size(): Int = map.size
}
