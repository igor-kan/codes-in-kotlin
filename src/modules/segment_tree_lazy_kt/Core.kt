package com.igorkan.modules.segment_tree_lazy_kt

class LazyMinSegmentTree(initial: LongArray) : LazyMinSegmentContract {
    private val n = initial.size
    private val tree = LongArray(maxOf(1, 4 * n))
    private val lazy = LongArray(maxOf(1, 4 * n))

    init {
        if (n <= 0) throw SegTreeException.InvalidArgument("array must be non-empty")
        build(1, 0, n - 1, initial)
    }

    private fun build(node: Int, l: Int, r: Int, src: LongArray) {
        if (l == r) {
            tree[node] = src[l]
            return
        }
        val mid = (l + r) ushr 1
        build(node shl 1, l, mid, src)
        build((node shl 1) or 1, mid + 1, r, src)
        tree[node] = minOf(tree[node shl 1], tree[(node shl 1) or 1])
    }

    private fun push(node: Int) {
        val tag = lazy[node]
        if (tag != 0L) {
            val lc = node shl 1
            val rc = lc or 1
            tree[lc] += tag
            lazy[lc] += tag
            tree[rc] += tag
            lazy[rc] += tag
            lazy[node] = 0L
        }
    }

    override fun rangeAdd(lo: Int, hi: Int, delta: Long) {
        validateRangeBounds(lo, hi, n)
        update(1, 0, n - 1, lo, hi, delta)
    }

    private fun update(node: Int, l: Int, r: Int, ql: Int, qr: Int, delta: Long) {
        if (ql <= l && r <= qr) {
            tree[node] += delta
            lazy[node] += delta
            return
        }
        push(node)
        val mid = (l + r) ushr 1
        if (ql <= mid) update(node shl 1, l, mid, ql, qr, delta)
        if (qr > mid) update((node shl 1) or 1, mid + 1, r, ql, qr, delta)
        tree[node] = minOf(tree[node shl 1], tree[(node shl 1) or 1])
    }

    override fun queryMin(lo: Int, hi: Int): Long {
        validateRangeBounds(lo, hi, n)
        return query(1, 0, n - 1, lo, hi)
    }

    private fun query(node: Int, l: Int, r: Int, ql: Int, qr: Int): Long {
        if (ql <= l && r <= qr) return tree[node]
        push(node)
        val mid = (l + r) ushr 1
        var ans = Long.MAX_VALUE
        if (ql <= mid) ans = minOf(ans, query(node shl 1, l, mid, ql, qr))
        if (qr > mid) ans = minOf(ans, query((node shl 1) or 1, mid + 1, r, ql, qr))
        return ans
    }

    override fun length(): Int = n
}
