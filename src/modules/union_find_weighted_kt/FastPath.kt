package com.igorkan.modules.union_find_weighted_kt

object FastPath {
    fun sameComponent(dsu: WeightedUnionFind, u: Int, v: Int): Boolean {
        val ru = dsu.findWithWeight(u).root
        val rv = dsu.findWithWeight(v).root
        return ru == rv
    }
}