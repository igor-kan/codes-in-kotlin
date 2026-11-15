package com.igorkan.modules.disjoint_set_rollback

interface RollbackDsuContract {
    fun find(x: Int): Int
    fun union(u: Int, v: Int): Boolean
    fun checkpoint(): Int
    fun rollbackTo(targetHeight: Int)
}
