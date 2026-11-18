package com.igorkan.modules.li_chao_envelope_kt

object Invariants {
    fun ensureTrue(cond: Boolean) {
        if (!cond) {
            throw ModException(ErrorCode.INVARIANT_VIOLATION, "invariant check failed")
        }
    }
}
