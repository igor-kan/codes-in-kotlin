package com.igorkan.modules.suffix_array_lcp_kt

object PropertyTests {
    @JvmStatic fun main(args: Array<String>) {
        require(Concurrent.parallelCounts(listOf("mississippi", "ississ"), "issi") == listOf(2, 1))
    }
}