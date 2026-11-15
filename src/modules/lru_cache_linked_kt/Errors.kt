package com.igorkan.modules.lru_cache_linked_kt

sealed class LruCacheException(message: String) : RuntimeException(message) {
    class InvalidArgument(msg: String) : LruCacheException(msg)
    class OutOfBounds(msg: String) : LruCacheException(msg)
    class InvariantViolation(msg: String) : LruCacheException(msg)
}

inline fun requireLruCache(cond: Boolean, lazyMsg: () -> String) {
    if (!cond) throw LruCacheException.InvariantViolation(lazyMsg())
}
