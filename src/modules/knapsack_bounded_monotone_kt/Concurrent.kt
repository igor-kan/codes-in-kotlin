package com.igorkan.modules.knapsack_bounded_monotone_kt

fun batchOptimizeLots(suites: List<Pair<List<BoundedLot>, Int>>): List<Long> {
    val solver = MonotoneDequeKnapsack()
    return suites.map { (lots, cap) -> solver.optimize(lots, cap).maxProfit }
}
