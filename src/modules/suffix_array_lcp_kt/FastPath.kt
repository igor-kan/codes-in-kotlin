package com.igorkan.modules.suffix_array_lcp_kt

object FastPath {
    fun countOccurrences(idx: SuffixIndex, pat: String): Int {
        var hits = 0
        for (i in idx.sa.indices) {
            val off = idx.sa[i]
            if (idx.text.regionMatches(off, pat, 0, pat.length)) hits++
        }
        return hits
    }
}
