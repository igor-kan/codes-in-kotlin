package com.igorkan.modules.lru_cache_linked_kt

import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.withLock

class SynchronizedLruCache<K, V>(capacity: Int) : LruContract<K, V> {
    private val lock = ReentrantLock()
    private val inner = LinkedLruCache<K, V>(capacity)

    override fun get(key: K): V? = lock.withLock { inner.get(key) }
    override fun put(key: K, value: V): V? = lock.withLock { inner.put(key, value) }
    override fun size(): Int = lock.withLock { inner.size() }
}
