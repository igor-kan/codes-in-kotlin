package com.igorkan.modules.knapsack_bounded_monotone_kt

data class BoundedLot(
    val weight: Int,
    val value: Long,
    val count: Int
)

data class KnapsackSummary(
    val maxProfit: Long,
    val usedCapacity: Int
)
