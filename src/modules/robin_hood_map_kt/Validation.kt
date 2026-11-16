package com.igorkan.modules.robin_hood_map_kt

fun validateMapCapacity(cap: Int) {
    if (cap <= 0 || (cap and (cap - 1)) != 0) {
        throw RobinMapException.InvalidArgument("capacity must be power of two > 0")
    }
}
