package com.igorkan.modules.knapsack_bounded_monotone_kt

fun propBoundedKnapsackShards() {
    val lots = listOf(BoundedLot(4, 9L, 6), BoundedLot(7, 17L, 3), BoundedLot(3, 6L, 5))
    for (cap in listOf(5, 12, 23, 35)) {
        verifyKnapsackOracle(lots, cap)
    }
}
