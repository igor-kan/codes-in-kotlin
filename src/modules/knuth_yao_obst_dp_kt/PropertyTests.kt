package com.igorkan.modules.knuth_yao_obst_dp_kt

object PropertyTests {
    @JvmStatic
    fun main(args: Array<String>) {
        require(Concurrent.batchFold(4) != 0L)
        require(ObstSolver.solve(longArrayOf(10, 12, 20)) == 72L)
    }
}
