package com.igorkan.modules.suffix_array_lcp_kt

object Benchmark {
    @JvmStatic
    fun main(args: Array<String>) {
        val t0 = System.nanoTime()
        var sink = 0L
        val b = KasaiSuffixBuilder(); val t = "abracadabra_".repeat(4); repeat(100) { sink += b.build(t).lcp.sum() }
        val ns = System.nanoTime() - t0
        println("suffix_array_lcp_kt ns=$ns sink=$sink")
    }
}
