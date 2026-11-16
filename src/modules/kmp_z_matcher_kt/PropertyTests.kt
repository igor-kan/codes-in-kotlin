package com.igorkan.modules.kmp_z_matcher_kt

fun propBatchCorpusParity() {
    val docs = listOf("aabaaabaaab", "zzzzzz", "baabaabaa")
    val hits = batchSearchCorpus(docs, "aab")
    requireMatcherKt(hits[0] == listOf(0, 4, 8) && hits[1].isEmpty()) { "batch parity failed" }
    for (d in docs) verifyMatcherOracle(d, "aa")
}
