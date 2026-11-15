package com.igorkan.modules.trie_aho_corasick_kt

fun validateAutomaton(ac: AhoCorasickMatcher) {
    for (st in ac.states) {
        requireAho(st.fail in 0 until ac.states.size) { "invalid fail link ${st.fail}" }
    }
}
