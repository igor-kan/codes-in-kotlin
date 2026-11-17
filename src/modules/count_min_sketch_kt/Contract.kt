package com.igorkan.modules.count_min_sketch_kt

interface AlgorithmContract {
    fun moduleTag(): String
    fun slug(): String = "count_min_sketch_kt"
    fun version(): Int = 1
}