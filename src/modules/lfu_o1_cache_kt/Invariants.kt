package com.igorkan.modules.lfu_o1_cache_kt

object Invariants {
    fun ensureTrue(cond: Boolean) {
        if (!cond) {
            throw ModException(ErrorCode.INVARIANT_VIOLATION, "failed")
        }
    }
}