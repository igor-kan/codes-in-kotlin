package com.igorkan.modules.hopcroft_karp_match_kt

object Validation {
    fun checkPositive(x: Int) {
        if (x <= 0) {
            throw ModException(ErrorCode.INVALID_INPUT, "must be > 0")
        }
    }
}
