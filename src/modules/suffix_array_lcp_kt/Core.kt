package com.igorkan.modules.suffix_array_lcp_kt

class KasaiSuffixBuilder : SuffixIndexer {
    override fun build(text: String): SuffixIndex {
        Validation.requireNonEmpty(text)
        val n = text.length
        val saObj = Array(n) { it }
        var rk = IntArray(n) { text[it].code }
        val tmp = IntArray(n)
        var step = 1
        while (step < n) {
            val k = step
            saObj.sortWith { a, b ->
                if (rk[a] != rk[b]) rk[a].compareTo(rk[b])
                else (if (a + k < n) rk[a + k] else -1).compareTo(if (b + k < n) rk[b + k] else -1)
            }
            tmp[saObj[0]] = 0
            for (i in 1 until n) {
                val a = saObj[i - 1]; val b = saObj[i]
                val diff = rk[a] != rk[b] || (if (a + k < n) rk[a + k] else -1) != (if (b + k < n) rk[b + k] else -1)
                tmp[b] = tmp[a] + if (diff) 1 else 0
            }
            rk = tmp.copyOf()
            if (rk[saObj[n - 1]] == n - 1) break
            step = step shl 1
        }
        val sa = IntArray(n) { saObj[it] }
        val inv = IntArray(n).also { for (i in 0 until n) it[sa[i]] = i }
        val lcp = IntArray(n)
        var h = 0
        for (i in 0 until n) {
            if (inv[i] > 0) {
                val j = sa[inv[i] - 1]
                while (i + h < n && j + h < n && text[i + h] == text[j + h]) h++
                lcp[inv[i]] = h
                if (h > 0) h--
            }
        }
        return SuffixIndex(text, sa, lcp)
    }
}
