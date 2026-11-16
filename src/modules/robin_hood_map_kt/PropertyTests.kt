package com.igorkan.modules.robin_hood_map_kt

fun propRobinMixedMutations() {
    val m = bulkLoadEntries((1..40).map { KeyValEntry(it.toLong(), it.toLong() * 10L) })
    for (k in 1L..20L) requireRobinMap(m.get(k) == k * 10L) { "bulk lookup failure" }
    validateMapCapacity(32)
}
