package com.igorkan.modules.lfu_o1_cache_kt

object Benchmark {
    @JvmStatic
    fun main(args: Array<String>) {
        val t0 = System.nanoTime()
        var sink = 0L
        repeat(500) { sink += FastPath.quickSum(longArrayOf(1L, 2L, it.toLong())) }
        val ns = System.nanoTime() - t0
        println("lfu_o1_cache_kt ns=$ns sink=$sink")
    }
}
