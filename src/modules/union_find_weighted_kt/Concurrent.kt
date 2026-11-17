package com.igorkan.modules.union_find_weighted_kt

import java.util.concurrent.Executors

object Concurrent {
    fun parallelVerify(n: Int, eqsList: List<List<Triple<Int, Int, Long>>>): List<Boolean> {
        val pool = Executors.newFixedThreadPool(2)
        try {
            return eqsList.map { eqs ->
                pool.submit<Boolean> {
                    val d = WeightedUnionFind(n)
                    eqs.all { (u, v, w) -> d.relate(u, v, w) }
                }
            }.map { it.get() }
        } finally { pool.shutdown() }
    }
}
