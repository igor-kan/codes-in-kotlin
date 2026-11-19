package com.igorkan.modules.fenwick_range_tree_d55

object Validation {
    fun checkPositive(x: Int) {
        if (x <= 0) {
            throw ModException(ErrorCode.INVALID_INPUT, "must be > 0")
        }
    }
}
