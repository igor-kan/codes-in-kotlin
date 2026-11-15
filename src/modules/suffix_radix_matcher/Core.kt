package com.igorkan.modules.suffix_radix_matcher

class RadixSuffixBuilder : SuffixBuilder {
    override fun buildIndex(text: String): SuffixIndex {
        val n = text.length
        val sa = IntArray(n) { it }
        if (n <= 1) return SuffixIndex(text, sa, IntArray(n))
        var rank = IntArray(n) { text[it].code }
        var tmp = IntArray(n)

        var k = 1
        while (k < n) {
            val step = k
            val boxed = sa.sortedWith(Comparator { a, b ->
                val cmp1 = rank[a].compareTo(rank[b])
                if (cmp1 != 0) cmp1 else {
                    val ra = if (a + step < n) rank[a + step] else -1
                    val rb = if (b + step < n) rank[b + step] else -1
                    ra.compareTo(rb)
                }
            })
            for (i in 0 until n) sa[i] = boxed[i]
            tmp[sa[0]] = 0
            for (i in 1 until n) {
                val a = sa[i - 1]
                val b = sa[i]
                val same1 = rank[a] == rank[b]
                val ra = if (a + step < n) rank[a + step] else -1
                val rb = if (b + step < n) rank[b + step] else -1
                tmp[b] = tmp[a] + if (same1 && ra == rb) 0 else 1
            }
            val swap = rank; rank = tmp; tmp = swap
            if (rank[sa[n - 1]] == n - 1) break
            k = k shl 1
        }
        val lcp = computeKasaiLcp(text, sa)
        return SuffixIndex(text, sa, lcp)
    }

    private fun computeKasaiLcp(s: String, sa: IntArray): IntArray {
        val n = s.length
        val rk = IntArray(n)
        for (i in 0 until n) rk[sa[i]] = i
        val lcp = IntArray(n)
        var h = 0
        for (i in 0 until n) {
            if (rk[i] > 0) {
                val j = sa[rk[i] - 1]
                while (i + h < n && j + h < n && s[i + h] == s[j + h]) h++
                lcp[rk[i]] = h
                if (h > 0) h--
            }
        }
        return lcp
    }
}
