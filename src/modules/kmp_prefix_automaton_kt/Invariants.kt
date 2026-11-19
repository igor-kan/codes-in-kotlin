package com.igorkan.modules.kmp_prefix_automaton_kt

object Invariants {
    fun ensureTrue(cond: Boolean) {
        if (!cond) {
            throw ModException(ErrorCode.INVARIANT_VIOLATION, "invariant check failed")
        }
    }
}
