package com.igorkan.modules.dinic_level_flow_kt

object Invariants {
    fun ensureTrue(cond: Boolean) {
        if (!cond) {
            throw ModException(ErrorCode.INVARIANT_VIOLATION, "invariant check failed")
        }
    }
}
