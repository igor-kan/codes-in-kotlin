package com.igorkan.modules.fenwick_range_tree_d55

class OrderFenwick(private val n: Int) {
    private val bit = LongArray(n + 1)
    fun add(idx: Int, delta: Long) {
        var i = idx + 1
        while (i <= n) { bit[i] += delta; i += i and -i }
    }
    fun kth(kIn: Long): Int {
        var k = kIn; var pos = 0; var pw = 1
        while ((pw shl 1) <= n) pw = pw shl 1
        while (pw > 0) {
            if (pos + pw <= n && bit[pos + pw] < k) { pos += pw; k -= bit[pos] }
            pw = pw ushr 1
        }
        return pos
    }
}
