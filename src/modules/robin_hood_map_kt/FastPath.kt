package com.igorkan.modules.robin_hood_map_kt

fun bulkLoadEntries(entries: List<KeyValEntry>): RobinHoodLongMap {
    val map = RobinHoodLongMap(maxOf(16, entries.size * 2))
    for (e in entries) map.put(e.key, e.value)
    return map
}
