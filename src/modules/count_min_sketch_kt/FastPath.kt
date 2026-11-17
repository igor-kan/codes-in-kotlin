package com.igorkan.modules.count_min_sketch_kt

object FastPath {
    fun quickSum(a: LongArray): Long {
        var s = 0L
        for (v in a) {
            s += v
        }
        return s
    }
}