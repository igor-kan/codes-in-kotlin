package com.igorkan.modules.fenwick_range_tree_kt

fun validateNonNegativeWeights(bit: BinaryIndexedTree) {
    for (idx in bit.raw.indices) {
        val v = bit.raw[idx]
        requireFenwick(v >= 0L) { "negative frequency at $idx invalidates lifting" }
    }
}
