package com.igorkan.modules.fenwick_range_tree_kt

class BinaryIndexedTree(initial: LongArray) : PrefixTree {
    val n: Int = initial.size
    val tree = LongArray(n + 1)
    val raw = initial.copyOf()

    init {
        for (i in 1..n) {
            tree[i] += raw[i - 1]
            val j = i + (i and -i)
            if (j <= n) tree[j] += tree[i]
        }
    }

    override fun add(index: Int, delta: Long) {
        if (index !in 0 until n) throw FenwickException.OutOfBounds("index $index")
        raw[index] += delta
        var i = index + 1
        while (i <= n) {
            tree[i] += delta
            i += i and -i
        }
    }

    override fun prefixSum(count: Int): Long {
        var i = count.coerceIn(0, n)
        var acc = 0L
        while (i > 0) {
            acc += tree[i]
            i -= i and -i
        }
        return acc
    }

    override fun rangeSum(l: Int, r: Int): Long =
        if (l >= r) 0L else prefixSum(r) - prefixSum(l)

    fun lowerBound(target: Long): Int? {
        if (target <= 0L) return if (n > 0) 1 else null
        var pos = 0
        var acc = 0L
        var step = Integer.highestOneBit(n.coerceAtLeast(1))
        while (step > 0) {
            val nxt = pos + step
            if (nxt <= n && acc + tree[nxt] < target) {
                pos = nxt
                acc += tree[nxt]
            }
            step = step ushr 1
        }
        return if (pos + 1 <= n) pos + 1 else null
    }
}
