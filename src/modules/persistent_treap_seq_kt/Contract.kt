package com.igorkan.modules.persistent_treap_seq_kt

interface AlgorithmContract {
    fun moduleSlug(): String = "persistent_treap_seq_kt"
    fun version(): Int = 1
    fun isThreadSafe(): Boolean = true
}
