package com.igorkan.modules.li_chao_envelope_kt

object Validation {
    fun checkPositive(x: Int) {
        if (x <= 0) {
            throw ModException(ErrorCode.INVALID_INPUT, "must be > 0")
        }
    }
}
