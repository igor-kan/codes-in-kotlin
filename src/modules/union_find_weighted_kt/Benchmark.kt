package com.igorkan.modules.union_find_weighted_kt

object Benchmark {
    @JvmStatic
    fun main(args: Array<String>) {
        val t0 = System.nanoTime()
        var sink = 0L
        val d = WeightedUnionFind(128); for(i in 0 until 127) d.relate(i, i+1, 2); repeat(500) { sink += d.diff(0, it % 127 + 1) ?: 0L }
        val ns = System.nanoTime() - t0
        println("union_find_weighted_kt ns=$ns sink=$sink")
    }
}
