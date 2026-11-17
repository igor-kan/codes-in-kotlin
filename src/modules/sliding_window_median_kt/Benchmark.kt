package com.igorkan.modules.sliding_window_median_kt

object Benchmark {
    @JvmStatic
    fun main(args: Array<String>) {
        val t0 = System.nanoTime()
        var sink = 0L
        repeat(500) { sink += FastPath.quickSum(longArrayOf(1L, 2L, it.toLong())) }
        val ns = System.nanoTime() - t0
        println("sliding_window_median_kt ns=$ns sink=$sink")
    }
}
