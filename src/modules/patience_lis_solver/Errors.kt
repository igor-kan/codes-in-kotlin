package com.igorkan.modules.patience_lis_solver

sealed class PatienceException(message: String) : RuntimeException(message) {
    class InvalidArgument(msg: String) : PatienceException(msg)
    class OutOfBounds(msg: String) : PatienceException(msg)
    class InvariantViolation(msg: String) : PatienceException(msg)
}

inline fun requirePatience(cond: Boolean, lazyMsg: () -> String) {
    if (!cond) throw PatienceException.InvariantViolation(lazyMsg())
}
