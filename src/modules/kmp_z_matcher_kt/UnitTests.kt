package com.igorkan.modules.kmp_z_matcher_kt

fun testKmpOverlapAndPeriod() {
    val m = DualStringMatcher()
    requireMatcherKt(m.findAllOffsets("ababaaba", "aba") == listOf(0, 2, 5)) { "overlap fail" }
    requireMatcherKt(m.countNonOverlapping("aaaaa", "aa") == 2) { "non-overlap count fail" }
    requireMatcherKt(minimalPeriod("abcabcabc") == 3) { "period fail" }
    verifyMatcherOracle("abracadabra", "abra")
}
