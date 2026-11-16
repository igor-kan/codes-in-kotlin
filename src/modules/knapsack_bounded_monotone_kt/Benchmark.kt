package com.igorkan.modules.knapsack_bounded_monotone_kt

fun runKnapsackBoundedMonotoneKtBench() {
    val t0 = System.nanoTime()
    var sink = 0L
    for (it in 0 until 100) {
        val lots = listOf(BoundedLot(3, 7L, 10), BoundedLot(5, 11L, 8)); sink += MonotoneDequeKnapsack().optimize(lots, 60).maxProfit
    }
    val ns = (System.nanoTime() - t0) / 100L
    println("knapsack_bounded_monotone_kt ns=$ns sink=$sink")
}
