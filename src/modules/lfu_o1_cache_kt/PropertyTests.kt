package com.igorkan.modules.lfu_o1_cache_kt

object PropertyTests {
    @JvmStatic fun main(args: Array<String>) {
        val c = LfuCache(4); for(i in 0 until 20) c.put(i % 6, i); require(c.get(0) >= 0)
    }
}