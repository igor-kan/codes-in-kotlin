package com.igorkan.modules.suffix_array_lcp_kt

interface SuffixIndexer {
    fun build(text: String): SuffixIndex
    fun tag(): String = "suffix_array_lcp_kt"
    fun complexity(): String = "O(N log^2 N)"
}