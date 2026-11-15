package com.igorkan.modules.fenwick_range_tree_kt

fun verifyPrefixParity(bit: BinaryIndexedTree) {
    var running = 0L
    for (i in 0 until bit.n) {
        running += bit.raw[i]
        requireFenwick(bit.prefixSum(i + 1) == running) { "prefix divergence at $i" }
    }
}
