package com.igorkan.modules.knapsack_bounded_monotone_kt

fun validateBoundedInput(lots: List<BoundedLot>, capacity: Int) {
    if (capacity < 0) throw KnapMonoException.InvalidArgument("negative capacity")
    for (lot in lots) {
        if (lot.weight <= 0 || lot.count < 0 || lot.value < 0L) {
            throw KnapMonoException.InvalidArgument("invalid bounded lot $lot")
        }
    }
}
