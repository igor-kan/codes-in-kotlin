package com.igorkan.modules.skip_list_deterministic_kt

sealed class SkipListException(message: String) : RuntimeException(message) {
    class InvalidArgument(msg: String) : SkipListException(msg)
    class OutOfBounds(msg: String) : SkipListException(msg)
    class InvariantViolation(msg: String) : SkipListException(msg)
}

inline fun requireSkipList(cond: Boolean, lazyMsg: () -> String) {
    if (!cond) throw SkipListException.InvariantViolation(lazyMsg())
}
