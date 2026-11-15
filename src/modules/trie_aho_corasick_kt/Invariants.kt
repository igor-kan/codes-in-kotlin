package com.igorkan.modules.trie_aho_corasick_kt

fun verifyMatchesExact(text: String, hits: List<AcMatch>) {
    for (h in hits) {
        requireAho(text.substring(h.offset, h.offset + h.pattern.length) == h.pattern) {
            "mismatched hit at ${h.offset}"
        }
    }
}
