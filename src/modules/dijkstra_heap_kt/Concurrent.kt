package com.igorkan.modules.dijkstra_heap_kt

object Concurrent {
    fun batchRun(n: Int): Long {
        var s = 0L
        for (i in 0 until n) {
            s += i
        }
        return s
    }
}