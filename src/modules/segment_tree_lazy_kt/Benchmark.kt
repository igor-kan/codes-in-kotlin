package com.igorkan.modules.segment_tree_lazy_kt

fun runSegmentTreeLazyKtBench() {
    val t0 = System.nanoTime()
    var sink = 0L
    for (it in 0 until 100) {
        val seg = LazyMinSegmentTree(LongArray(256) { it.toLong() }); seg.rangeAdd(10, 200, 3L); sink += seg.queryMin(0, 255)
    }
    val ns = (System.nanoTime() - t0) / 100L
    println("segment_tree_lazy_kt ns=$ns sink=$sink")
}
