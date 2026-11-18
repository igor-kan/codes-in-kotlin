package com.igorkan.modules.knuth_yao_obst_dp_kt

object ObstSolver {
    fun solve(freq: LongArray): Long {
        val n = freq.size
        val pref = LongArray(n + 1)
        for (i in 0 until n) pref[i + 1] = pref[i] + freq[i]
        val dp = Array(n) { LongArray(n) }
        val opt = Array(n) { IntArray(n) }
        for (i in 0 until n) { dp[i][i] = freq[i]; opt[i][i] = i }
        for (len in 2..n) {
            for (i in 0..n - len) {
                val j = i + len - 1
                val w = pref[j + 1] - pref[i]
                var best = Long.MAX_VALUE / 4
                var br = i
                for (r in opt[i][j - 1]..opt[i + 1][j]) {
                    val c = (if (r > i) dp[i][r - 1] else 0L) + (if (r < j) dp[r + 1][j] else 0L) + w
                    if (c < best) { best = c; br = r }
                }
                dp[i][j] = best; opt[i][j] = br
            }
        }
        return dp[0][n - 1]
    }
}
