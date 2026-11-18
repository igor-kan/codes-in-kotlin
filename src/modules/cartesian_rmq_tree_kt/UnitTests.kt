package com.igorkan.modules.cartesian_rmq_tree_kt

object UnitTests {
    @JvmStatic
    fun main(args: Array<String>) {
        Validation.checkPositive(1)
        val ct = CartesianRmq(longArrayOf(9, 3, 7, 1, 8, 12, 10, 20, 15, 18, 5)); require(ct.queryIdx(0, 2) == 1 && ct.queryIdx(4, 10) == 10)
        Invariants.ensureTrue(true)
    }
}
