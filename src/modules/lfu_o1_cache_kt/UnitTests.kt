package com.igorkan.modules.lfu_o1_cache_kt

object UnitTests {
    @JvmStatic fun main(args: Array<String>) {
        val c = LfuCache(2); c.put(1,10); c.put(2,20); c.get(1); c.put(3,30); require(c.get(2) == -1 && c.get(1) == 10)
    }
}