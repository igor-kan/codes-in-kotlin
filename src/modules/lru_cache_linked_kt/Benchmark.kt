package com.igorkan.modules.lru_cache_linked_kt

fun runBenchmark() {
    val lru = LinkedLruCache<Int, Int>(512)
    val t0 = System.nanoTime()
    var sink = 0
    for (i in 0 until 50000) {
        lru.put(i and 1023, i)
        sink += lru.get(i and 255) ?: 0
    }
    println("lru_cache_linked_kt ns=${(System.nanoTime() - t0) / 50000} sink=$sink")
}
