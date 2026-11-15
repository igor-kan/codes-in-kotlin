package com.igorkan.modules.trie_aho_corasick_kt

fun countHitsFast(ac: AhoCorasickMatcher, text: String): Int {
    val matches = ac.scan(text)
    return matches.size
}

fun hasAnyMatchFast(ac: AhoCorasickMatcher, text: String): Boolean {
    return ac.scan(text).isNotEmpty()
}
