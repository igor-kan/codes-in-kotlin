package com.igorkan.modules.manacher_palindrome_kt

class ManacherEngine : PalindromeAnalyzer {
    override fun analyze(text: String): PalinSummary {
        Validation.requireNonEmpty(text)
        val n = text.length
        val t = CharArray(2 * n + 3)
        t[0] = '^'
        for (i in 0 until n) {
            t[2 * i + 1] = '#'
            t[2 * i + 2] = text[i]
        }
        t[2 * n + 1] = '#'
        t[2 * n + 2] = '$'
        val m = t.size
        val p = IntArray(m)
        var center = 0
        var right = 0
        var bestLen = 0
        var bestCenter = 0
        var total = 0L
        for (i in 1 until m - 1) {
            val mirror = 2 * center - i
            if (i < right) p[i] = minOf(right - i, p[mirror])
            while (t[i + 1 + p[i]] == t[i - 1 - p[i]]) p[i]++
            if (i + p[i] > right) { center = i; right = i + p[i] }
            if (p[i] > bestLen) { bestLen = p[i]; bestCenter = i }
            total += ((p[i] + 1) / 2).toLong()
        }
        val start = (bestCenter - bestLen) / 2
        return PalinSummary(text.substring(start, start + bestLen), start, bestLen, total)
    }
}
