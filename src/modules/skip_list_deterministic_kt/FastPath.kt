package com.igorkan.modules.skip_list_deterministic_kt

fun allOrderedKeys(sl: DeterministicSkipList): List<Long> {
    if (sl.count == 0) return emptyList()
    return sl.rangeQuery(Long.MIN_VALUE + 1L, Long.MAX_VALUE).keys
}

fun containsAny(sl: DeterministicSkipList, probeKeys: List<Long>): Boolean {
    return probeKeys.any { sl.get(it) != null }
}
