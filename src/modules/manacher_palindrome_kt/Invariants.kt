package com.igorkan.modules.manacher_palindrome_kt

object Invariants {
    fun verifyBrute(s: String, res: PalinSummary) {
        require(FastPath.isPalinSlice(s, res.start, res.start + res.length))
        var cnt = 0L
        for (i in s.indices) for (j in i + 1..s.length) if (FastPath.isPalinSlice(s, i, j)) cnt++
        require(res.count == cnt) { "count mismatch: ${res.count} != $cnt" }
    }
}
