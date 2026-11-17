package com.igorkan.modules.lfu_o1_cache_kt

object Validation {
    fun checkPositive(x: Int) {
        if (x <= 0) {
            throw ModException(ErrorCode.INVALID_INPUT, "must be > 0")
        }
    }
}