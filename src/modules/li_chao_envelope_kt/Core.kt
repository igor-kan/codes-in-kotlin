package com.igorkan.modules.li_chao_envelope_kt

class LiChaoTree(private val dom: Int) {
    data class Line(val m: Long, val b: Long) { fun eval(x: Long): Long = m * x + b }
    private val tree = Array(4 * dom + 4) { Line(0L, Long.MAX_VALUE / 4) }
    fun addLine(m: Long, b: Long) = ins(1, 0, dom - 1, Line(m, b))
    private fun ins(v: Int, l: Int, r: Int, nwIn: Line) {
        var nw = nwIn
        val mid = (l + r) ushr 1
        val lb = nw.eval(l.toLong()) < tree[v].eval(l.toLong())
        val mb = nw.eval(mid.toLong()) < tree[v].eval(mid.toLong())
        if (mb) { val t = tree[v]; tree[v] = nw; nw = t }
        if (l == r) return
        if (lb != mb) ins(v shl 1, l, mid, nw) else ins(v shl 1 or 1, mid + 1, r, nw)
    }
    fun query(x: Int): Long {
        var v = 1; var l = 0; var r = dom - 1; var best = Long.MAX_VALUE / 4
        while (true) {
            best = minOf(best, tree[v].eval(x.toLong()))
            if (l == r) return best
            val mid = (l + r) ushr 1
            if (x <= mid) { v = v shl 1; r = mid } else { v = v shl 1 or 1; l = mid + 1 }
        }
    }
}
