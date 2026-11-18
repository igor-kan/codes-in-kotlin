package com.igorkan.modules.cartesian_rmq_tree_kt

object PropertyTests {
    @JvmStatic
    fun main(args: Array<String>) {
        require(Concurrent.batchFold(4) != 0L)
        val ct = CartesianRmq(longArrayOf(5, 2, 8)); require(ct.queryIdx(0, 2) == 1)
    }
}
