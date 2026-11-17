package com.igorkan.modules.count_min_sketch_kt

data class ModuleStats(
    val items: Int,
    val checkVal: Long,
    val version: Int = 1
)