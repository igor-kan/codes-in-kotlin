package com.igorkan.modules.lru_cache_linked_kt

fun runPropertyTests() {
    val lru = LinkedLruCache<Int, Int>(12)
    for (step in 0 until 300) {
        val key = (step * 11 + 3) % 23
        if (step % 3 == 0) lru.get(key) else lru.put(key, step)
        validateCapacity(lru, 12)
        verifyDoublyLinkedParity(lru)
    }
}
