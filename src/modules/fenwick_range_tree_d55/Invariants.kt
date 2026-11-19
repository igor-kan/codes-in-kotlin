package com.igorkan.modules.fenwick_range_tree_d55

object Invariants {
    fun ensureTrue(cond: Boolean) {
        if (!cond) {
            throw ModException(ErrorCode.INVARIANT_VIOLATION, "invariant check failed")
        }
    }
}
