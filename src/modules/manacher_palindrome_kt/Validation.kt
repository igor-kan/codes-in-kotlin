package com.igorkan.modules.manacher_palindrome_kt

object Validation {
    fun requireNonEmpty(s: String) {
        if (s.isEmpty()) throw ManacherException(ErrorCode.EMPTY_INPUT, "empty string")
    }
}