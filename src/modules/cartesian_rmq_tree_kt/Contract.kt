package com.igorkan.modules.cartesian_rmq_tree_kt

interface AlgorithmContract {
    fun moduleSlug(): String = "cartesian_rmq_tree_kt"
    fun version(): Int = 1
    fun isThreadSafe(): Boolean = true
}
