package com.igorkan.modules.fenwick_range_tree_kt

fun runBenchmark() {
    val bit = BinaryIndexedTree(LongArray(4096) { 2L })
    val t0 = System.nanoTime()
    var sink = 0L
    for (i in 0 until 20000) {
        bit.add(i and 4095, 1L)
        sink += bit.rangeSum(10, 3000)
    }
    println("fenwick_range_tree_kt ns=${(System.nanoTime() - t0) / 20000} sink=$sink")
}
