package com.igorkan.modules.dijkstra_heap_kt

object FastPath {
    fun quickSum(a: LongArray): Long {
        var s = 0L
        for (v in a) {
            s += v
        }
        return s
    }
}