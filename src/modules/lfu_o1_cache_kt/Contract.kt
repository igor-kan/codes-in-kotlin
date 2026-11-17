package com.igorkan.modules.lfu_o1_cache_kt

interface AlgorithmContract {
    fun moduleTag(): String
    fun slug(): String = "lfu_o1_cache_kt"
    fun version(): Int = 1
}