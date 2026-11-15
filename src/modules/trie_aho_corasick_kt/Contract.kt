package com.igorkan.modules.trie_aho_corasick_kt

interface MultiMatcher {
    val patterns: List<String>
    fun scan(text: String): List<AcMatch>
    fun countTotalMatches(text: String): Int = scan(text).size
}
