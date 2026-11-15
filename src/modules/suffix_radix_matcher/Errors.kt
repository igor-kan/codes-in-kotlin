package com.igorkan.modules.suffix_radix_matcher

sealed class SuffixException(message: String) : RuntimeException(message) {
    class InvalidArgument(msg: String) : SuffixException(msg)
    class OutOfBounds(msg: String) : SuffixException(msg)
    class InvariantViolation(msg: String) : SuffixException(msg)
}

inline fun requireSuffix(cond: Boolean, lazyMsg: () -> String) {
    if (!cond) throw SuffixException.InvariantViolation(lazyMsg())
}
