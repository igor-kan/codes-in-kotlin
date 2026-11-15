package com.igorkan.modules.lru_cache_linked_kt

fun runUnitTests() {
    val lru = LinkedLruCache<String, Int>(2)
    lru.put("a", 1)
    lru.put("b", 2)
    check(lru.get("a") == 1)
    lru.put("c", 3)
    check(lru.get("b") == null)
    check(lru.get("a") == 1)
    verifyDoublyLinkedParity(lru)
}
