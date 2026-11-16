package com.igorkan.modules.kmp_z_matcher_kt

class DualStringMatcher : LinearPatternContract {
    override fun buildLps(pattern: CharSequence): IntArray {
        validatePattern(pattern)
        val m = pattern.length
        val lps = IntArray(m)
        var j = 0
        for (i in 1 until m) {
            while (j > 0 && pattern[i] != pattern[j]) j = lps[j - 1]
            if (pattern[i] == pattern[j]) j++
            lps[i] = j
        }
        return lps
    }

    override fun findAllOffsets(text: CharSequence, pattern: CharSequence): List<Int> {
        validatePattern(pattern)
        val lps = buildLps(pattern)
        val out = ArrayList<Int>()
        var j = 0
        for (i in text.indices) {
            while (j > 0 && text[i] != pattern[j]) j = lps[j - 1]
            if (text[i] == pattern[j]) j++
            if (j == pattern.length) {
                out.add(i - pattern.length + 1)
                j = lps[j - 1]
            }
        }
        return out
    }

    override fun countNonOverlapping(text: CharSequence, pattern: CharSequence): Int {
        validatePattern(pattern)
        val lps = buildLps(pattern)
        var j = 0
        var count = 0
        for (i in text.indices) {
            while (j > 0 && text[i] != pattern[j]) j = lps[j - 1]
            if (text[i] == pattern[j]) j++
            if (j == pattern.length) {
                count++
                j = 0
            }
        }
        return count
    }
}
