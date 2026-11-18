package com.igorkan.modules.hopcroft_karp_match_kt

object PropertyTests {
    @JvmStatic
    fun main(args: Array<String>) {
        require(Concurrent.batchFold(4) != 0L)
        val hk = HopcroftKarp(3, 2, listOf(0 to 0, 1 to 0, 2 to 1)); require(hk.maxMatching() == 2)
    }
}
