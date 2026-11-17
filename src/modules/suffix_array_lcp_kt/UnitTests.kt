package com.igorkan.modules.suffix_array_lcp_kt

object UnitTests {
    @JvmStatic fun main(args: Array<String>) {
        val idx = KasaiSuffixBuilder().build("banana$")
        Invariants.verifySa(idx)
        require(FastPath.countOccurrences(idx, "ana") == 2)
    }
}