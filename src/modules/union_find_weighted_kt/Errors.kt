package com.igorkan.modules.union_find_weighted_kt

enum class ErrorCode {
    INVALID_INPUT,
    OUT_OF_BOUNDS,
    EMPTY_INPUT,
    INVARIANT_VIOLATION
}

class WeightedDsuException(val code: ErrorCode, message: String) : RuntimeException(message)
