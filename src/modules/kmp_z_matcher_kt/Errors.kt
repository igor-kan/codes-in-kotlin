package com.igorkan.modules.kmp_z_matcher_kt

sealed class MatcherKtException(message: String) : RuntimeException(message) {
    class InvalidArgument(msg: String) : MatcherKtException(msg)
    class OutOfBounds(msg: String) : MatcherKtException(msg)
    class InvariantViolation(msg: String) : MatcherKtException(msg)
}

inline fun requireMatcherKt(cond: Boolean, lazyMsg: () -> String) {
    if (!cond) throw MatcherKtException.InvariantViolation(lazyMsg())
}
