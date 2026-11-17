package com.igorkan.modules.suffix_array_lcp_kt

object Invariants {
    fun verifySa(idx: SuffixIndex) {
        for (i in 1 until idx.sa.size) {
            val a = idx.text.substring(idx.sa[i - 1])
            val b = idx.text.substring(idx.sa[i])
            require(a < b) { "SA order mismatch" }
        }
    }
}
