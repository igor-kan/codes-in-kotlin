package com.igorkan.modules.skip_list_deterministic_kt

fun validateSkipRange(lo: Long, hi: Long) {
    if (lo > hi) {
        throw SkipListException.OutOfBounds("range lo ($lo) > hi ($hi)")
    }
}

fun isValidSkipLevel(level: Int, maxLevel: Int): Boolean {
    return level in 1..maxLevel
}
