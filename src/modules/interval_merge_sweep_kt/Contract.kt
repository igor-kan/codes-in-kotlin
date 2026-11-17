package com.igorkan.modules.interval_merge_sweep_kt

interface AlgorithmContract {
    fun moduleTag(): String
    fun slug(): String = "interval_merge_sweep_kt"
    fun version(): Int = 1
}