package com.igorkan.modules.knuth_yao_obst_dp_kt

object Benchmark {
    @JvmStatic
    fun main(args: Array<String>) {
        val t0 = System.nanoTime()
        var sink = 0L
        repeat(200) {
            sink += FastPath.quickFold(longArrayOf(1L, 2L, it.toLong()))
        }
        val ns = System.nanoTime() - t0
        println("knuth_yao_obst_dp_kt ns=$ns sink=$sink")
    }
}
