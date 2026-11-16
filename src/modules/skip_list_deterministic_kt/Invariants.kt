package com.igorkan.modules.skip_list_deterministic_kt

fun verifySkipListOrder(sl: DeterministicSkipList) {
    val ks = allOrderedKeys(sl)
    requireSkipList(ks.size == sl.count) { "count drift" }
    for (i in 1 until ks.size) {
        requireSkipList(ks[i - 1] < ks[i]) { "unsorted keys at $i" }
    }
}
