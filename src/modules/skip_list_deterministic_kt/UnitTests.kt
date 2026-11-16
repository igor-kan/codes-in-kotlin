package com.igorkan.modules.skip_list_deterministic_kt

fun testSkipListCrudAndSlice() {
    val sl = DeterministicSkipList(99L)
    for (k in listOf(30L, 10L, 50L, 20L, 40L)) sl.put(k, k * 10L)
    requireSkipList(sl.get(30L) == 300L) { "get failed" }
    requireSkipList(sl.delete(20L)) { "delete failed" }
    requireSkipList(sl.rangeQuery(15L, 45L).keys == listOf(30L, 40L)) { "range slice mismatch" }
    verifySkipListOrder(sl)
}
