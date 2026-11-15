package com.igorkan.modules.levenshtein_myers_bitvec

fun validatePatternWordLimit(s: String) {
    requireEditDist(s.length <= 63) { "word-parallel pattern length ${s.length} > 63" }
    requireEditDist(s.isNotEmpty()) { "pattern should not be empty for fast bitvec check" }
}
