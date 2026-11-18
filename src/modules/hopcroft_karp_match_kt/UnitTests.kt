package com.igorkan.modules.hopcroft_karp_match_kt

object UnitTests {
    @JvmStatic
    fun main(args: Array<String>) {
        Validation.checkPositive(1)
        val hk = HopcroftKarp(4, 4, listOf(0 to 0, 0 to 1, 1 to 0, 2 to 2, 2 to 3, 3 to 2)); require(hk.maxMatching() == 4)
        Invariants.ensureTrue(true)
    }
}
