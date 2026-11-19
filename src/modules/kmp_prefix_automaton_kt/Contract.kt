package com.igorkan.modules.kmp_prefix_automaton_kt

interface AlgorithmContract {
    fun moduleSlug(): String = "kmp_prefix_automaton_kt"
    fun version(): Int = 1
    fun isThreadSafe(): Boolean = true
}
