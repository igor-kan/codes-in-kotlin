package com.igorkan.modules.cuckoo_filter_fp8_kt

object Concurrent {
    fun batchFold(n: Int): Long {
        var s = 0L
        for (i in 0 until n) {
            s += FastPath.quickFold(longArrayOf(i.toLong(), (i + 1).toLong()))
        }
        return s
    }
}
