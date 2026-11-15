package com.igorkan.modules.levenshtein_myers_bitvec

data class EditDistanceReport(
    val distance: Int,
    val leftLen: Int,
    val rightLen: Int
)

data class BitMaskPair(
    val pv: Long,
    val mv: Long
)
