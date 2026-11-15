package com.igorkan.modules.circuit_breaker_fsm_kt

sealed class BreakerException(message: String) : RuntimeException(message) {
    class InvalidArgument(msg: String) : BreakerException(msg)
    class OutOfBounds(msg: String) : BreakerException(msg)
    class InvariantViolation(msg: String) : BreakerException(msg)
}

inline fun requireBreaker(cond: Boolean, lazyMsg: () -> String) {
    if (!cond) throw BreakerException.InvariantViolation(lazyMsg())
}
