package com.igorkan.modules.lru_cache_linked_kt

fun <K, V> snapshotStats(cache: LinkedLruCache<K, V>): CacheStats {
    val hits = cache.hits
    val misses = cache.misses
    val evictions = cache.evictions
    return CacheStats(hits, misses, evictions)
}
