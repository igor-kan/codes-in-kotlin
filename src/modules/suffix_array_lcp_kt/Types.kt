package com.igorkan.modules.suffix_array_lcp_kt

data class SuffixIndex(
    val text: String,
    val sa: IntArray,
    val lcp: IntArray,
    val version: Int = 1
)