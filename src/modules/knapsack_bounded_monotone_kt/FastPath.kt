package com.igorkan.modules.knapsack_bounded_monotone_kt

fun unrolledOracleProfit(lots: List<BoundedLot>, capacity: Int): Long {
    val dp = LongArray(capacity + 1)
    for (lot in lots) {
        for (c in 0 until lot.count) {
            for (w in capacity downTo lot.weight) {
                val cand = dp[w - lot.weight] + lot.value
                if (cand > dp[w]) dp[w] = cand
            }
        }
    }
    return dp[capacity]
}
