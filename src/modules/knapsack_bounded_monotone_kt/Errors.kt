package com.igorkan.modules.knapsack_bounded_monotone_kt

sealed class KnapMonoException(message: String) : RuntimeException(message) {
    class InvalidArgument(msg: String) : KnapMonoException(msg)
    class OutOfBounds(msg: String) : KnapMonoException(msg)
    class InvariantViolation(msg: String) : KnapMonoException(msg)
}

inline fun requireKnapMono(cond: Boolean, lazyMsg: () -> String) {
    if (!cond) throw KnapMonoException.InvariantViolation(lazyMsg())
}
