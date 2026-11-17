package com.igorkan.modules.interval_merge_sweep_kt

object Invariants {
    fun ensureTrue(cond: Boolean) {
        if (!cond) {
            throw ModException(ErrorCode.INVARIANT_VIOLATION, "failed")
        }
    }
}