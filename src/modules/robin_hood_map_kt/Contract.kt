package com.igorkan.modules.robin_hood_map_kt

interface PrimitiveLongMap {
    fun put(key: Long, value: Long): Long?
    fun get(key: Long): Long?
    fun remove(key: Long): Long?
    fun size(): Int
}
