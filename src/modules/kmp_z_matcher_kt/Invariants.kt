package com.igorkan.modules.kmp_z_matcher_kt

fun verifyMatcherOracle(text: String, pattern: String) {
    val got = DualStringMatcher().findAllOffsets(text, pattern)
    val expected = ArrayList<Int>()
    for (i in 0..(text.length - pattern.length)) {
        if (text.regionMatches(i, pattern, 0, pattern.length)) expected.add(i)
    }
    requireMatcherKt(got == expected) { "KMP matches disagree with naive regionMatches" }
}
