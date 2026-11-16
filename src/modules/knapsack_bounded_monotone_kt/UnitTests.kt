package com.igorkan.modules.knapsack_bounded_monotone_kt

fun testBoundedKnapsackBasic() {
    val lots = listOf(BoundedLot(3, 8L, 4), BoundedLot(5, 15L, 2), BoundedLot(2, 5L, 5))
    verifyKnapsackOracle(lots, 14)
}
