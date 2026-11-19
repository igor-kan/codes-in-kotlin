package com.igorkan.modules.stoer_wagner_mincut_kt

interface AlgorithmContract {
    fun moduleSlug(): String = "stoer_wagner_mincut_kt"
    fun version(): Int = 1
    fun isThreadSafe(): Boolean = true
}
