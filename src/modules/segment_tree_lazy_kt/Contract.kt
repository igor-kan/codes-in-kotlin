package com.igorkan.modules.segment_tree_lazy_kt

interface LazyMinSegmentContract {
    fun rangeAdd(lo: Int, hi: Int, delta: Long)
    fun queryMin(lo: Int, hi: Int): Long
    fun length(): Int
}
