package com.igorkan.modules.levenshtein_myers_bitvec

fun wagnerFischerOracle(a: String, b: String): Int {
    val dp = IntArray(b.length + 1) { it }
    for (i in 1..a.length) {
        var prev = dp[0]
        dp[0] = i
        for (j in 1..b.length) {
            val save = dp[j]
            dp[j] = if (a[i - 1] == b[j - 1]) prev else 1 + minOf(prev, dp[j], dp[j - 1])
            prev = save
        }
    }
    return dp[b.length]
}
