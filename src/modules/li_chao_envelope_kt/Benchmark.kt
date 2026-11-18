package com.igorkan.modules.li_chao_envelope_kt

object Benchmark {
    @JvmStatic
    fun main(args: Array<String>) {
        val t0 = System.nanoTime()
        var sink = 0L
        repeat(200) {
            sink += FastPath.quickFold(longArrayOf(1L, 2L, it.toLong()))
        }
        val ns = System.nanoTime() - t0
        println("li_chao_envelope_kt ns=$ns sink=$sink")
    }
}
