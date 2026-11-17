package com.igorkan.modules.union_find_weighted_kt

interface PotentialDsu {
    fun relate(u: Int, v: Int, diffUminusV: Long): Boolean
    fun diff(u: Int, v: Int): Long?
    fun tag(): String = "union_find_weighted_kt"
}