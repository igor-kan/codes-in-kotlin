package com.igorkan.modules.disjoint_set_rollback

fun sameComponent(dsu: RollbackDsu, a: Int, b: Int): Boolean {
    val ra = dsu.find(a)
    val rb = dsu.find(b)
    return ra == rb
}

fun batchAllConnected(dsu: RollbackDsu, pairs: List<Pair<Int, Int>>): Boolean {
    for ((u, v) in pairs) {
        if (dsu.find(u) != dsu.find(v)) return false
    }
    return true
}
