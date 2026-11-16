package com.igorkan.modules.segment_tree_lazy_kt

data class SegRangeOp(
    val left: Int,
    val right: Int,
    val delta: Long
)

data class SegTreeStats(
    val leafCount: Int,
    val updatesApplied: Long,
    val queriesServed: Long
)
