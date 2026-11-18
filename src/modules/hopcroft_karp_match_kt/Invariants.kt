package com.igorkan.modules.hopcroft_karp_match_kt

object Invariants {
    fun ensureTrue(cond: Boolean) {
        if (!cond) {
            throw ModException(ErrorCode.INVARIANT_VIOLATION, "invariant check failed")
        }
    }
}
