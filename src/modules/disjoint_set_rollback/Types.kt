package com.igorkan.modules.disjoint_set_rollback

data class UndoRecord(
    val child: Int,
    val parent: Int,
    val prevParentSize: Int
)

data class DsuSnapshot(
    val stackHeight: Int,
    val components: Int
)
