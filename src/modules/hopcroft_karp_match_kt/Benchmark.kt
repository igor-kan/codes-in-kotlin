package com.igorkan.modules.hopcroft_karp_match_kt

object Benchmark {
    @JvmStatic
    fun main(args: Array<String>) {
        val t0 = System.nanoTime()
        var sink = 0L
        repeat(200) {
            sink += FastPath.quickFold(longArrayOf(1L, 2L, it.toLong()))
        }
        val ns = System.nanoTime() - t0
        println("hopcroft_karp_match_kt ns=$ns sink=$sink")
    }
}
