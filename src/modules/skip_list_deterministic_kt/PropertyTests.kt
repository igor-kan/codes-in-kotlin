package com.igorkan.modules.skip_list_deterministic_kt

fun propSkipListSortedOracle() {
    val sl = DeterministicSkipList(777L)
    for (i in 0 until 80) sl.put(((i * 37L) % 61L), i.toLong())
    verifySkipListOrder(sl)
    requireSkipList(batchRangeCounts(sl, listOf(0L to 30L, 31L to 60L)).sum() == sl.count) { "partition count fail" }
}
