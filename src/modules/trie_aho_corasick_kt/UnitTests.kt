package com.igorkan.modules.trie_aho_corasick_kt

fun runUnitTests() {
    val ac = AhoCorasickMatcher(listOf("he", "she", "his", "hers"))
    validateAutomaton(ac)
    val text = "ushers_his"
    val hits = ac.scan(text)
    verifyMatchesExact(text, hits)
    check(hits.size == 4)
}
