package com.igorkan.modules.fenwick_range_tree_kt

interface PrefixTree {
    fun add(index: Int, delta: Long)
    fun prefixSum(count: Int): Long
    fun rangeSum(l: Int, r: Int): Long
}
