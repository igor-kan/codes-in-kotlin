package com.igorkan.modules.interval_merge_sweep_kt

object FastPath {
    fun quickSum(a: LongArray): Long {
        var s = 0L
        for (v in a) {
            s += v
        }
        return s
    }
}