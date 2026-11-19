package com.igorkan.modules.fenwick_range_tree_d55

object Benchmark {
    @JvmStatic
    fun main(args: Array<String>) {
        val t0 = System.nanoTime()
        var sink = 0L
        repeat(200) {
            sink += FastPath.quickFold(longArrayOf(1L, 2L, it.toLong()))
        }
        val ns = System.nanoTime() - t0
        println("fenwick_range_tree_d55 ns=$ns sink=$sink")
    }
}
