package com.igorkan.modules.fenwick_range_tree_kt

sealed class FenwickException(message: String) : RuntimeException(message) {
    class InvalidArgument(msg: String) : FenwickException(msg)
    class OutOfBounds(msg: String) : FenwickException(msg)
    class InvariantViolation(msg: String) : FenwickException(msg)
}

inline fun requireFenwick(cond: Boolean, lazyMsg: () -> String) {
    if (!cond) throw FenwickException.InvariantViolation(lazyMsg())
}
