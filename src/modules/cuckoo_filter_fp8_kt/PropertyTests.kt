package com.igorkan.modules.cuckoo_filter_fp8_kt

object PropertyTests {
    @JvmStatic
    fun main(args: Array<String>) {
        require(Concurrent.batchFold(4) != 0L)
        val cf = CuckooFilter(32); cf.insert(99L); require(cf.lookup(99L))
    }
}
