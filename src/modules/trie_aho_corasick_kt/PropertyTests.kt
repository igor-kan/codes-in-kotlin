package com.igorkan.modules.trie_aho_corasick_kt

fun runPropertyTests() {
    val pats = listOf("ab", "ba", "aba", "b")
    val ac = AhoCorasickMatcher(pats)
    val hay = "ababaab"
    val got = ac.scan(hay)
    verifyMatchesExact(hay, got)
    var brute = 0
    for (p in pats) for (i in 0..hay.length - p.length) if (hay.startsWith(p, i)) brute++
    check(got.size == brute)
}
