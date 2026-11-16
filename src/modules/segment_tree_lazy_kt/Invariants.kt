package com.igorkan.modules.segment_tree_lazy_kt

fun verifySegTreeAgainstOracle(initial: LongArray, ops: List<SegRangeOp>) {
    val oracle = initial.copyOf()
    val seg = LazyMinSegmentTree(initial)
    for (op in ops) {
        seg.rangeAdd(op.left, op.right, op.delta)
        for (i in op.left..op.right) oracle[i] += op.delta
    }
    for (l in initial.indices) {
        var cur = oracle[l]
        for (r in l until initial.size) {
            cur = minOf(cur, oracle[r])
            requireSegTree(seg.queryMin(l, r) == cur) { "RMQ mismatch at [$l, $r]" }
        }
    }
}
