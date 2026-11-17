package com.igorkan.modules.interval_merge_sweep_kt

class IntervalMerger {
    fun merge(raw: List<LongArray>): List<LongArray> {
        if (raw.isEmpty()) return emptyList()
        val sorted = raw.sortedBy { it[0] }
        val out = ArrayList<LongArray>()
        var s = sorted[0][0]; var e = sorted[0][1]
        for (i in 1 until sorted.size) {
            val iv = sorted[i]
            if (iv[0] <= e + 1L) e = maxOf(e, iv[1])
            else { out.add(longArrayOf(s, e)); s = iv[0]; e = iv[1] }
        }
        out.add(longArrayOf(s, e))
        return out
    }
}