package com.igorkan.modules.kmp_z_matcher_kt

data class MatchReport(
    val overlappingOffsets: List<Int>,
    val nonOverlappingCount: Int,
    val patternPeriod: Int
)

data class PrefixTables(
    val lps: IntArray,
    val zPrefix: IntArray
)
