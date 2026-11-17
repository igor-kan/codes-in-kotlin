package com.igorkan.modules.union_find_weighted_kt

object UnitTests {
    @JvmStatic fun main(args: Array<String>) {
        val d = WeightedUnionFind(5)
        require(d.relate(0, 1, 10))
        require(d.relate(1, 2, 5))
        Invariants.verifyConsistent(d, 0, 2, 15)
        require(!d.relate(0, 2, 99))
    }
}