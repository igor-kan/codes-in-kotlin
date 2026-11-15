package com.igorkan.modules.suffix_radix_matcher

fun runPropertyTests() {
    val s = "abracadabra"
    val idx = RadixSuffixBuilder().buildIndex(s)
    verifyLexSortedAndLcp(idx)
    val set = HashSet<String>()
    for (i in s.indices) for (j in i + 1..s.length) set.add(s.substring(i, j))
    check(countDistinctSubstrings(idx) == set.size.toLong())
}
