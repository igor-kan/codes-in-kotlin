package com.igorkan.modules.hopcroft_karp_match_kt

object Concurrent {
    fun batchFold(n: Int): Long {
        var s = 0L
        for (i in 0 until n) {
            s += FastPath.quickFold(longArrayOf(i.toLong(), (i + 1).toLong()))
        }
        return s
    }
}
