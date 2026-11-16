package com.igorkan.modules.knapsack_bounded_monotone_kt

fun verifyKnapsackOracle(lots: List<BoundedLot>, capacity: Int) {
    val fast = MonotoneDequeKnapsack().optimize(lots, capacity).maxProfit
    val oracle = unrolledOracleProfit(lots, capacity)
    requireKnapMono(fast == oracle) { "bounded DP mismatch: fast=$fast vs oracle=$oracle" }
}
