package com.igorkan.modules.knapsack_bounded_monotone_kt

interface BoundedKnapsackContract {
    fun optimize(lots: List<BoundedLot>, capacity: Int): KnapsackSummary

    fun optimizeProfitOnly(lots: List<BoundedLot>, capacity: Int): Long {
        return optimize(lots, capacity).maxProfit
    }
}
