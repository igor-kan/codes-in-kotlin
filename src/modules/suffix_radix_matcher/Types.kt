package com.igorkan.modules.suffix_radix_matcher

data class SuffixIndex(
    val text: String,
    val sa: IntArray,
    val lcp: IntArray
)

data class SuffixSpan(
    val start: Int,
    val end: Int
)
