package com.igorkan.modules.knuth_yao_obst_dp_kt

enum class ErrorCode {
    INVALID_INPUT,
    OUT_OF_BOUNDS,
    EMPTY_INPUT,
    INVARIANT_VIOLATION
}

class ModException(val code: ErrorCode, message: String) : RuntimeException(message)
