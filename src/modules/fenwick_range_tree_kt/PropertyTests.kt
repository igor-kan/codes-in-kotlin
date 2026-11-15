package com.igorkan.modules.fenwick_range_tree_kt

fun runPropertyTests() {
    val bit = BinaryIndexedTree(LongArray(64) { 1L })
    for (step in 0 until 200) {
        bit.add((step * 17 + 5) % 64, ((step % 9) - 3).toLong())
        verifyPrefixParity(bit)
    }
}
