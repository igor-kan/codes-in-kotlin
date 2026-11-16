package com.igorkan.modules.segment_tree_lazy_kt

fun validateRangeBounds(lo: Int, hi: Int, n: Int) {
    if (lo < 0 || hi >= n || lo > hi) {
        throw SegTreeException.OutOfBounds("invalid range [$lo, $hi] for n=$n")
    }
}
