package com.igorkan.modules.dijkstra_heap_kt

object Invariants {
    fun ensureTrue(cond: Boolean) {
        if (!cond) {
            throw ModException(ErrorCode.INVARIANT_VIOLATION, "failed")
        }
    }
}