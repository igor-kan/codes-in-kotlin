package com.igorkan.modules.segment_tree_lazy_kt

fun parallelVerifyAllSubranges(base: LongArray, shards: List<List<SegRangeOp>>): List<Long> {
    return shards.map { ops ->
        val seg = applyOpsBatch(base.copyOf(), ops)
        seg.queryMin(0, base.size - 1)
    }
}
