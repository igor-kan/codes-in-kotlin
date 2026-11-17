package com.igorkan.modules.union_find_weighted_kt

object Validation {
    fun requireNode(n: Int, x: Int) {
        if (x !in 0 until n) {
            throw WeightedDsuException(ErrorCode.OUT_OF_BOUNDS, "bad node")
        }
    }
}