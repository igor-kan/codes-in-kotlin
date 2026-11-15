package com.igorkan.modules.fenwick_range_tree_kt

fun runUnitTests() {
    val bit = BinaryIndexedTree(longArrayOf(2L, 5L, 1L, 7L, 3L))
    verifyPrefixParity(bit)
    check(bit.rangeSum(1, 4) == 13L)
    check(bit.lowerBound(8L) == 3)
    bit.add(0, 10L)
    check(bit.lowerBound(8L) == 1)
    verifyPrefixParity(bit)
}
