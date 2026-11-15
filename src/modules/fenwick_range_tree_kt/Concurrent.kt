package com.igorkan.modules.fenwick_range_tree_kt

import java.util.concurrent.locks.ReentrantReadWriteLock
import kotlin.concurrent.read
import kotlin.concurrent.write

class ConcurrentFenwick(initial: LongArray) {
    private val rw = ReentrantReadWriteLock()
    private val bit = BinaryIndexedTree(initial)

    fun add(idx: Int, delta: Long) = rw.write { bit.add(idx, delta) }
    fun rangeSum(l: Int, r: Int): Long = rw.read { bit.rangeSum(l, r) }
}
