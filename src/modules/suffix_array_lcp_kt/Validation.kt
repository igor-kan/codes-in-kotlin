package com.igorkan.modules.suffix_array_lcp_kt

object Validation {
    fun requireNonEmpty(s: String) {
        if (s.isEmpty()) {
            throw SuffixArrayException(ErrorCode.EMPTY_INPUT, "empty")
        }
    }
}