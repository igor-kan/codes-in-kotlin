package com.igorkan.modules.kmp_prefix_automaton_kt

object UnitTests {
    @JvmStatic
    fun main(args: Array<String>) {
        Validation.checkPositive(1)
        require(KmpScanner.searchAll("ababaababa", "aba") == listOf(0, 2, 5, 7))
        Invariants.ensureTrue(true)
    }
}
