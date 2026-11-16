package com.igorkan.modules.segment_tree_lazy_kt

fun propLazySegRandomized() {
    val arr = LongArray(20) { (it * 7L) % 13L }
    val ops = (0 until 25).map { i ->
        val l = (i * 5) % 18
        val r = minOf(19, l + (i % 6))
        SegRangeOp(l, r, (i % 5).toLong() - 2L)
    }
    verifySegTreeAgainstOracle(arr, ops)
    val outs = parallelVerifyAllSubranges(arr, listOf(ops))
    requireSegTree(outs.size == 1) { "parallel result missing" }
}
