package com.igorkan.modules.fenwick_range_tree_d55

enum class ErrorCode {
    INVALID_INPUT,
    OUT_OF_BOUNDS,
    EMPTY_INPUT,
    INVARIANT_VIOLATION
}

class ModException(val code: ErrorCode, message: String) : RuntimeException(message)
