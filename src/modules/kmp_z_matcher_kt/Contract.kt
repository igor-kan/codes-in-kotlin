package com.igorkan.modules.kmp_z_matcher_kt

interface LinearPatternContract {
    fun buildLps(pattern: CharSequence): IntArray
    fun findAllOffsets(text: CharSequence, pattern: CharSequence): List<Int>
    fun countNonOverlapping(text: CharSequence, pattern: CharSequence): Int
}
