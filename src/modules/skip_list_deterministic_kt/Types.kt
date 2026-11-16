package com.igorkan.modules.skip_list_deterministic_kt

class SkipNode(
    val key: Long,
    var value: Long,
    val level: Int
) {
    val next = arrayOfNulls<SkipNode>(level)
}

data class SkipRangeResult(
    val keys: List<Long>,
    val values: List<Long>
)
