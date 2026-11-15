package com.igorkan.modules.patience_lis_solver

data class LisResult(
    val length: Int,
    val values: IntArray,
    val indices: IntArray
)

data class PileTopSnapshot(
    val pileIndex: Int,
    val headValue: Int
)
