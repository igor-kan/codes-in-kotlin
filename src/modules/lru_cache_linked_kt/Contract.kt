package com.igorkan.modules.lru_cache_linked_kt

interface LruContract<K, V> {
    fun get(key: K): V?
    fun put(key: K, value: V): V?
    fun size(): Int
}
