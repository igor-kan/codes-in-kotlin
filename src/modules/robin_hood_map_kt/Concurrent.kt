package com.igorkan.modules.robin_hood_map_kt

fun snapshotLookupSum(map: RobinHoodLongMap, probeKeys: LongArray): Long {
    var total = 0L
    for (k in probeKeys) {
        total += (map.get(k) ?: 0L)
    }
    return total
}
