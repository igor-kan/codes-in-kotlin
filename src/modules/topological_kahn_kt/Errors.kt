package com.igorkan.modules.topological_kahn_kt

sealed class TopoException(message: String) : RuntimeException(message) {
    class InvalidArgument(msg: String) : TopoException(msg)
    class OutOfBounds(msg: String) : TopoException(msg)
    class InvariantViolation(msg: String) : TopoException(msg)
}

inline fun requireTopo(cond: Boolean, lazyMsg: () -> String) {
    if (!cond) throw TopoException.InvariantViolation(lazyMsg())
}
