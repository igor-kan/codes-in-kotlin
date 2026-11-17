package com.igorkan.modules.suffix_array_lcp_kt

enum class ErrorCode {
    INVALID_INPUT,
    OUT_OF_BOUNDS,
    EMPTY_INPUT,
    INVARIANT_VIOLATION
}

class SuffixArrayException(val code: ErrorCode, message: String) : RuntimeException(message)
