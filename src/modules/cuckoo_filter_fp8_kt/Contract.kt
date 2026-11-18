package com.igorkan.modules.cuckoo_filter_fp8_kt

interface AlgorithmContract {
    fun moduleSlug(): String = "cuckoo_filter_fp8_kt"
    fun version(): Int = 1
    fun isThreadSafe(): Boolean = true
}
