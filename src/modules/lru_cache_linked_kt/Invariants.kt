package com.igorkan.modules.lru_cache_linked_kt

fun <K, V> verifyDoublyLinkedParity(cache: LinkedLruCache<K, V>) {
    val fwd = ArrayList<K>()
    var cur = cache.head
    while (cur != null) {
        fwd.add(cur.key)
        cur = cur.next
    }
    val bwd = ArrayList<K>()
    var rcur = cache.tail
    while (rcur != null) {
        bwd.add(rcur.key)
        rcur = rcur.prev
    }
    requireLruCache(fwd.size == cache.size() && fwd == bwd.reversed()) { "linked list corruption" }
}
