package com.igorkan.modules.stoer_wagner_mincut_kt

object UnitTests {
    @JvmStatic
    fun main(args: Array<String>) {
        Validation.checkPositive(1)
        val g = arrayOf(longArrayOf(0,2,0,0,3),longArrayOf(2,0,3,0,2),longArrayOf(0,3,0,4,0),longArrayOf(0,0,4,0,1),longArrayOf(3,2,0,1,0)); require(StoerWagner.globalMinCut(g) == 4L)
        Invariants.ensureTrue(true)
    }
}
