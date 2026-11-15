package com.igorkan.modules.suffix_radix_matcher

fun runUnitTests() {
    val idx = RadixSuffixBuilder().buildIndex("banana")
    verifyLexSortedAndLcp(idx)
    // "banana" distinct substrings: 15
    check(countDistinctSubstrings(idx) == 15L)
}
