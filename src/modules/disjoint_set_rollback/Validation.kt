package com.igorkan.modules.disjoint_set_rollback

fun validateVertex(dsu: RollbackDsu, v: Int) {
    requireDsu(v >= 0) { "vertex $v must be non-negative" }
    requireDsu(v < dsu.n) { "vertex $v out of [0, ${dsu.n})" }
    requireDsu(dsu.compSize[v] >= 0) { "invalid component metadata" }
}
