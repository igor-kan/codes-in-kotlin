package com.igorkan.modules.fenwick_range_tree_kt

fun getMetrics(bit: BinaryIndexedTree): FenwickMetrics {
    val size = bit.n
    val total = bit.prefixSum(size)
    return FenwickMetrics(size, total)
}
