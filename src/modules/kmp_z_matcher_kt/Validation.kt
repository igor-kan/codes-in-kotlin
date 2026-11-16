package com.igorkan.modules.kmp_z_matcher_kt

fun validatePattern(pattern: CharSequence) {
    if (pattern.isEmpty()) {
        throw MatcherKtException.InvalidArgument("pattern cannot be empty")
    }
}

fun validatePatternAndText(text: CharSequence, pattern: CharSequence) {
    validatePattern(pattern)
    if (pattern.length > text.length && text.isEmpty()) {
        throw MatcherKtException.OutOfBounds("text is shorter than non-empty pattern")
    }
}
