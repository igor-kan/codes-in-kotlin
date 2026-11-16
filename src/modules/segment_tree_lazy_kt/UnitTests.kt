package com.igorkan.modules.segment_tree_lazy_kt

fun testLazySegBasic() {
    val arr = longArrayOf(5L, 2L, 8L, 1L, 9L, 3L)
    val ops = listOf(SegRangeOp(1, 4, 10L), SegRangeOp(0, 2, -3L))
    verifySegTreeAgainstOracle(arr, ops)
}
