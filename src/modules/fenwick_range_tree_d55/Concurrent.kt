package com.igorkan.modules.fenwick_range_tree_d55

object Concurrent {
    fun batchFold(n: Int): Long {
        var s = 0L
        for (i in 0 until n) {
            s += FastPath.quickFold(longArrayOf(i.toLong(), (i + 1).toLong()))
        }
        return s
    }
}
