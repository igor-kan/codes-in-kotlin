package com.igorkan.modules.lru_cache_linked_kt

fun <K, V> validateCapacity(cache: LinkedLruCache<K, V>, cap: Int) {
    requireLruCache(cap > 0) { "capacity must be positive: $cap" }
    requireLruCache(cache.size() <= cap) { "cache overflow: ${cache.size()} > $cap" }
    requireLruCache(cache.hits >= 0L && cache.misses >= 0L) { "corrupt telemetry counters" }
}
