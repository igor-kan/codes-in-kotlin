package com.igorkan.modules.union_find_weighted_kt

data class FindResult(
    val root: Int,
    val weightToRoot: Long,
    val valid: Boolean = true
)