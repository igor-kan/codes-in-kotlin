package com.igorkan.modules.vose_alias_sampler_kt

interface AlgorithmContract {
    fun moduleSlug(): String = "vose_alias_sampler_kt"
    fun version(): Int = 1
    fun isThreadSafe(): Boolean = true
}
