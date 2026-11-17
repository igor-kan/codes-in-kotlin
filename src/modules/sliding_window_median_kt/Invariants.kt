package com.igorkan.modules.sliding_window_median_kt

object Invariants {
    fun ensureTrue(cond: Boolean) {
        if (!cond) {
            throw ModException(ErrorCode.INVARIANT_VIOLATION, "failed")
        }
    }
}