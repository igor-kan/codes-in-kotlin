package com.igorkan.modules.kmp_prefix_automaton_kt

object PropertyTests {
    @JvmStatic
    fun main(args: Array<String>) {
        require(Concurrent.batchFold(4) != 0L)
        require(KmpScanner.searchAll("abcdef", "xyz").isEmpty())
    }
}
