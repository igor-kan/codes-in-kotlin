package com.igorkan.modules.segment_tree_lazy_kt

sealed class SegTreeException(message: String) : RuntimeException(message) {
    class InvalidArgument(msg: String) : SegTreeException(msg)
    class OutOfBounds(msg: String) : SegTreeException(msg)
    class InvariantViolation(msg: String) : SegTreeException(msg)
}

inline fun requireSegTree(cond: Boolean, lazyMsg: () -> String) {
    if (!cond) throw SegTreeException.InvariantViolation(lazyMsg())
}
