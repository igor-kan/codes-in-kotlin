package com.igorkan.modules.lfu_o1_cache_kt

data class ModuleStats(
    val items: Int,
    val checkVal: Long,
    val version: Int = 1
)