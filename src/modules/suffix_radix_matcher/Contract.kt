package com.igorkan.modules.suffix_radix_matcher

interface SuffixBuilder {
    fun buildIndex(text: String): SuffixIndex
    fun lcpLength(index: SuffixIndex, rankPos: Int): Int {
        return if (rankPos in index.lcp.indices) index.lcp[rankPos] else 0
    }
}
