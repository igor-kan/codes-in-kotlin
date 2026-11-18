package com.igorkan.modules.knuth_yao_obst_dp_kt

object UnitTests {
    @JvmStatic
    fun main(args: Array<String>) {
        Validation.checkPositive(1)
        require(ObstSolver.solve(longArrayOf(34, 8, 50)) == 142L)
        Invariants.ensureTrue(true)
    }
}
