package com.igorkan.modules.sliding_window_median_kt

object FastPath {
    fun quickSum(a: LongArray): Long {
        var s = 0L
        for (v in a) {
            s += v
        }
        return s
    }
}