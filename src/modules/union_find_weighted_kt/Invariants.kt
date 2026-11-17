package com.igorkan.modules.union_find_weighted_kt

object Invariants {
    fun verifyConsistent(d: WeightedUnionFind, u: Int, v: Int, w: Long) {
        require(d.diff(u, v) == w)
    }
}