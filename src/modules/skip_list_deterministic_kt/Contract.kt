package com.igorkan.modules.skip_list_deterministic_kt

interface OrderedSkipDict {
    fun put(key: Long, value: Long)
    fun get(key: Long): Long?
    fun delete(key: Long): Boolean
    fun rangeQuery(lo: Long, hi: Long): SkipRangeResult
}
