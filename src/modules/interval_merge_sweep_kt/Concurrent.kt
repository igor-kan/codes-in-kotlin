package com.igorkan.modules.interval_merge_sweep_kt

object Concurrent {
    fun batchRun(n: Int): Long {
        var s = 0L
        for (i in 0 until n) {
            s += i
        }
        return s
    }
}