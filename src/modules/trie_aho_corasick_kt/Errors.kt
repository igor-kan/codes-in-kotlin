package com.igorkan.modules.trie_aho_corasick_kt

sealed class AhoException(message: String) : RuntimeException(message) {
    class InvalidArgument(msg: String) : AhoException(msg)
    class OutOfBounds(msg: String) : AhoException(msg)
    class InvariantViolation(msg: String) : AhoException(msg)
}

inline fun requireAho(cond: Boolean, lazyMsg: () -> String) {
    if (!cond) throw AhoException.InvariantViolation(lazyMsg())
}
