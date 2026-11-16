package com.igorkan.modules.robin_hood_map_kt

sealed class RobinMapException(message: String) : RuntimeException(message) {
    class InvalidArgument(msg: String) : RobinMapException(msg)
    class OutOfBounds(msg: String) : RobinMapException(msg)
    class InvariantViolation(msg: String) : RobinMapException(msg)
}

inline fun requireRobinMap(cond: Boolean, lazyMsg: () -> String) {
    if (!cond) throw RobinMapException.InvariantViolation(lazyMsg())
}
