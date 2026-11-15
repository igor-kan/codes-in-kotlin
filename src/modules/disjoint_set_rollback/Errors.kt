package com.igorkan.modules.disjoint_set_rollback

sealed class DsuException(message: String) : RuntimeException(message) {
    class InvalidArgument(msg: String) : DsuException(msg)
    class OutOfBounds(msg: String) : DsuException(msg)
    class InvariantViolation(msg: String) : DsuException(msg)
}

inline fun requireDsu(cond: Boolean, lazyMsg: () -> String) {
    if (!cond) throw DsuException.InvariantViolation(lazyMsg())
}
