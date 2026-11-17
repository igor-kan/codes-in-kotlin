package com.igorkan.modules.manacher_palindrome_kt

enum class ErrorCode {
    INVALID_INPUT,
    OUT_OF_BOUNDS,
    EMPTY_INPUT,
    INVARIANT_VIOLATION
}

class ManacherException(val code: ErrorCode, message: String) : RuntimeException(message)
