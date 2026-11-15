package com.igorkan.modules.lru_cache_linked_kt

data class CacheStats(
    val hits: Long,
    val misses: Long,
    val evictions: Long
)

class LruNode<K, V>(
    val key: K,
    var value: V,
    var prev: LruNode<K, V>? = null,
    var next: LruNode<K, V>? = null
)
