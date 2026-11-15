package com.igorkan.modules.levenshtein_myers_bitvec

sealed class EditDistException(message: String) : RuntimeException(message) {
    class InvalidArgument(msg: String) : EditDistException(msg)
    class OutOfBounds(msg: String) : EditDistException(msg)
    class InvariantViolation(msg: String) : EditDistException(msg)
}

inline fun requireEditDist(cond: Boolean, lazyMsg: () -> String) {
    if (!cond) throw EditDistException.InvariantViolation(lazyMsg())
}
