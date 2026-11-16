package com.igorkan.modules.skip_list_deterministic_kt

fun batchRangeCounts(sl: DeterministicSkipList, bounds: List<Pair<Long, Long>>): List<Int> {
    val out = ArrayList<Int>(bounds.size)
    for ((lo, hi) in bounds) {
        out.add(sl.rangeQuery(lo, hi).keys.size)
    }
    return out
}
