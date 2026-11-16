package com.igorkan.modules.kmp_z_matcher_kt

fun batchSearchCorpus(docs: List<String>, pattern: String): List<List<Int>> {
    val m = DualStringMatcher()
    return docs.map { d -> m.findAllOffsets(d, pattern) }
}
