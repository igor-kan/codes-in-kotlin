package com.igorkan.modules.tarjan_scc_iterative_kt

sealed class SccKtException(message: String) : RuntimeException(message) {
    class InvalidArgument(msg: String) : SccKtException(msg)
    class OutOfBounds(msg: String) : SccKtException(msg)
    class InvariantViolation(msg: String) : SccKtException(msg)
}

inline fun requireSccKt(cond: Boolean, lazyMsg: () -> String) {
    if (!cond) throw SccKtException.InvariantViolation(lazyMsg())
}
