package com.igorkan.modules.robin_hood_map_kt

data class HashMapStats(
    val size: Int,
    val capacity: Int,
    val maxProbeDistance: Int
)

data class KeyValEntry(
    val key: Long,
    val value: Long
)
