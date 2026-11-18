package com.igorkan.modules.cuckoo_filter_fp8_kt

enum class ErrorCode {
    INVALID_INPUT,
    OUT_OF_BOUNDS,
    EMPTY_INPUT,
    INVARIANT_VIOLATION
}

class ModException(val code: ErrorCode, message: String) : RuntimeException(message)
