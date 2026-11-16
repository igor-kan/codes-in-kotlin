package com.igorkan.modules.segment_tree_lazy_kt

fun applyOpsBatch(initial: LongArray, ops: List<SegRangeOp>): LazyMinSegmentTree {
    val seg = LazyMinSegmentTree(initial)
    for (op in ops) {
        seg.rangeAdd(op.left, op.right, op.delta)
    }
    return seg
}
