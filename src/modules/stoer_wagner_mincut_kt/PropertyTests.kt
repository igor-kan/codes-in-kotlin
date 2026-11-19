package com.igorkan.modules.stoer_wagner_mincut_kt

object PropertyTests {
    @JvmStatic
    fun main(args: Array<String>) {
        require(Concurrent.batchFold(4) != 0L)
        val g = arrayOf(longArrayOf(0,10,0),longArrayOf(10,0,2),longArrayOf(0,2,0)); require(StoerWagner.globalMinCut(g) == 2L)
    }
}
