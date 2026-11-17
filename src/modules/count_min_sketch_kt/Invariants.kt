package com.igorkan.modules.count_min_sketch_kt

object Invariants {
    fun ensureTrue(cond: Boolean) {
        if (!cond) {
            throw ModException(ErrorCode.INVARIANT_VIOLATION, "failed")
        }
    }
}