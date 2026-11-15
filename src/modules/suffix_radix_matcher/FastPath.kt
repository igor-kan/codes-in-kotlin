package com.igorkan.modules.suffix_radix_matcher

fun countDistinctSubstrings(idx: SuffixIndex): Long {
    val n = idx.text.length.toLong()
    val total = n * (n + 1L) / 2L
    val dup = idx.lcp.sumOf { it.toLong() }
    return total - dup
}
