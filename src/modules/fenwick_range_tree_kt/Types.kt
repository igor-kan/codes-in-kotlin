package com.igorkan.modules.fenwick_range_tree_kt

data class FenwickMetrics(
    val size: Int,
    val totalSum: Long,
    val bitMaskWidth: Int = 64
)

data class RangeDeltaUpdate(
    val index: Int,
    val delta: Long
)
