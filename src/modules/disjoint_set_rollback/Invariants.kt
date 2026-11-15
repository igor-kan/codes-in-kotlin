package com.igorkan.modules.disjoint_set_rollback

fun verifySizeConservation(dsu: RollbackDsu) {
    var rootCount = 0
    var sumSizes = 0
    for (i in 0 until dsu.n) {
        if (dsu.parent[i] == i) {
            rootCount++
            sumSizes += dsu.compSize[i]
        }
    }
    requireDsu(rootCount == dsu.components && sumSizes == dsu.n) { "DSU conservation violated" }
}
